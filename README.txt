
---------------
-Documentation-
---------------

-----------------------------------
**COMPILING AND USING THE LIBRARY**
------------------------------------

To compile, make sure that a java sdk version of at least 1.7 is installed
and that the jar archive tool is installed.

You can check by typing "javac -version"
you should see something like "javac 1.7.0_65"

Type "jar" and your screen should scroll with many jar options.


-----------------
-Compile library-
-----------------

If using Windows run makeit.bat. If using linux/unix run makeit.sh .
In linux/unix you will have to make makeit.sh executable.
To make it executable type

"chmod +x makeit.sh"

When done compiling, AmverseasBinFileUtils.jar will be placed in the lib directory.


Some example programs are included to get an idea of how to use the library.

--------------------------
-Compile example programs-
--------------------------
linux
-----
javac -cp .:lib/AmverseasBinFileUtils.jar DecoderTest.java
javac -cp .:lib/AmverseasBinFileUtils.jar DecoderTestASCII.java
javac -cp .:lib/AmverseasBinFileUtils.jar DecoderTestGetDepths.java

windows
-------
javac -cp .;lib/AmverseasBinFileUtils.jar DecoderTest.java
javac -cp .;lib/AmverseasBinFileUtils.jar DecoderTestASCII.java
javac -cp .;lib/AmverseasBinFileUtils.jar DecoderTestGetDepths.java

----------------------
-Run example programs-
----------------------

linux
-----
java -cp .:lib/AmverseasBinFileUtils.jar DecoderTest profile.bin
java -cp .:lib/AmverseasBinFileUtils.jar DecoderTestASCII profile.bin
java -cp .:lib/AmverseasBinFileUtils.jar DecoderTestGetDepths profile.bin

windows
-------
java -cp .;lib/AmverseasBinFileUtils.jar DecoderTest profile.bin
java -cp .;lib/AmverseasBinFileUtils.jar DecoderTestASCII profile.bin
java -cp .;lib/AmverseasBinFileUtils.jar DecoderTestGetDepths profile.bin






