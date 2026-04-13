#!/bin/bash
if [ -d "lib" ]; then
    rm -r lib
fi
mkdir ./lib
cp ./libs/* ./lib
javac -d ./  -cp ./lib/commons-math3-3.6.1.jar ./src/binfileutils/*.java
jar cfm AmverseasBinFileUtils.jar manifest.txt binfileutils/*.class 

rm -r ./binfileutils
mv ./AmverseasBinFileUtils.jar ./lib

javadoc -classpath ./libs/commons-math3-3.6.1.jar -author -version -use -d ./docs ./src/binfileutils/*.java




