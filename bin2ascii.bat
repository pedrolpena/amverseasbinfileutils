@ECHO OFF

REM LIB      holds the path to your libraries
REM PROGRAM  holds the the path to the java binary
REM CP       holds the classpath

SET LIB=.\lib
SET PROGRAM=.\

REM Don't edit CP unless you're going to add to the class path
SET CP=.;%LIB%\AmverseasBinFileUtils.jar;%LIB%\commons-math3-3.6.1.jar;%PROGRAM%
REM uncomment this line to compile the program. once compiled, comment this again.
REM javac -cp %CP% BinConverter.java
java -cp %CP% BinConverter %1 %2 %3


