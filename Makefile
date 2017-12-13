all:
	javac *.java -Xdiags:verbose
	#javac ./symbolic/*.java -Xdiags:verbose

run: all
	java SymbCalc

runTests: all
	javac -cp .:junit-4.XX.jar:hamcrest-core-1.3.jar Tests.java
	java -cp .:junit-4.XX.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore Tests

clean:
	rm -f *.class
	#rm -f ./symbolic/*.class
