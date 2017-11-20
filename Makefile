all:
	javac *.java

run: all
	java SymbCalc

clean:
	rm -f *.class
