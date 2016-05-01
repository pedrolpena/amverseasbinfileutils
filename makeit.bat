@echo off

javac -source 1.7 -target 1.7 -d .\ .\src\binfileutils\*.java
jar cfm AmverseasBinFileUtils.jar manifest.txt binfileutils\*.class
IF EXIST .\lib goto deletelib

:deletelib

del /q /s .\lib  > nul

rmdir /q /s .\lib  > nul

:exit

mkdir .\lib
move /y AmverseasBinFileUtils.jar .\lib > nul
del /s /q .\binfileutils > nul
rmdir .\binfileutils > nul

javadoc -author -version -use -d .\docs .\src\binfileutils\*.java
