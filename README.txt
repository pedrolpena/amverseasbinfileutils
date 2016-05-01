
--------------
Documentation-
--------------

After running makeit.sh or makeit.bat a docs folder will be created with the class
documentation. Open index.html with a browser.

------------------------
Compile example program-
------------------------
linux
-----
javac -cp .:lib/AmverseasBinFileUtils.jar decoderTest.java

windows
-------
javac -cp .;lib/AmverseasBinFileUtils.jar decoderTest.java


--------------------
Run example program-
--------------------

linux
-----
java -cp .:lib/AmverseasBinFileUtils.jar decoderTest profile.bin

windows
-------
java -cp .;lib/AmverseasBinFileUtils.jar decoderTest profile.bin
