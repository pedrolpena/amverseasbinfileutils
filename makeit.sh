#!/bin/bash
if [ -d "lib" ]; then
    rm -r lib
fi
mkdir ./lib
cp ./libs/commons-math3-3.6.1.jar ./lib
javac -source 1.7 -target 1.7 -d ./  -cp ./lib/commons-math3-3.6.1.jar ./src/binfileutils/*.java
jar cfm AmverseasBinFileUtils.jar manifest.txt binfileutils/*.class 

rm -r ./binfileutils
mv ./AmverseasBinFileUtils.jar ./lib

javadoc -classpath ./libs/commons-math3-3.6.1.jar -author -version -use -d ./docs ./src/binfileutils/*.java




