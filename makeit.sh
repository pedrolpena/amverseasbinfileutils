#!/bin/bash
javac -source 1.7 -target 1.7 -d ./ ./src/binfileutils/*.java
jar cfm AmverseasBinFileUtils.jar manifest.txt binfileutils/*.class 
if [ -d "lib" ]; then
    rm -r lib
fi
mkdir ./lib
rm -r ./binfileutils
mv ./AmverseasBinFileUtils.jar ./lib

javadoc -author -version -use -d ./docs ./src/binfileutils/*.java




