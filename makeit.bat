@echo off

IF EXIST .\lib goto deletelib

:deletelib

del /q /s .\lib  > nul

rmdir /q /s .\lib  > nul

:exit

mkdir .\lib
copy .\libs\*.* .\lib
javac -source 1.7 -target 1.7 -d .\ -cp .\lib\commons-math3-3.6.1.jar .\src\binfileutils\*.java
jar cfm AmverseasBinFileUtils.jar manifest.txt binfileutils\*.class

move /y AmverseasBinFileUtils.jar .\lib > nul
del /s /q .\binfileutils > nul
rmdir .\binfileutils > nul

javadoc -classpath .\libs\commons-math3-3.6.1.jar -author -version -use -d .\docs .\src\binfileutils\*.java
pause
