default:
	echo "Chose one module!"

clean:
	rm -rf out/*

simple:
	find ./verySimple/ -name "*.java" | xargs javac -verbose -d out/production/verySimple
	java -p out/production/ -m verySimple/simple.example.VerySimple

start:
	find ./beginner/ -name "*.java" | xargs javac -verbose -p out/production/ -d out/production/beginner
	java -p out/production/ -m beginner/com.start.Main

APItest:
	find ./calculatorAPI/ -name "*.java" | xargs javac -d out/production/calculatorAPI
	java -p out/production/ -m calculatorAPI/com.CalculatorTest

IMPLtest:
	find ./calcIMPL/ -name "*.java" | xargs javac -p out/production/ -d out/production/calcIMPL
	java -p out/production/ -m calcIMPL/implementation.TestThisImplementation

buildJAR: simple
	cd out/production/verySimple/ && find -name "*.class" | xargs jar --verbose --create --file executed.jar --main-class simple.example.VerySimple
	mkdir -p out/artifacts/ && mv -uv out/production/verySimple/executed.jar out/artifacts/executed.jar

buildJRE:
	rm -rf ./myJRE
	jlink -v -p $JAVA_HOME/jmods:out/artifacts/ --add-modules verySimple --output myJRE

runJRE:
	myJRE/bin/java -m verySimple
	du -hs myJRE