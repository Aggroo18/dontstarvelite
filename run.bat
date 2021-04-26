@ECHO OFF
javac --release 8 Main.java
chcp 65001
java -Dfile.encoding=UTF-8 Main