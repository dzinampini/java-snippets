# The Java Ecosystem 

## Maybe a bit of history first
-initiated by a team known as the Green Team
-team members were James Gosling, Mike Sheridan, Patrick Nughton
-they were Sun Microsystem engineers
-Code started in 1991
-Sun Microsystems was acquired by Oracle Corporation in 2010

-so the language was meant for small embedded systems in electrnic appliances 
-first it was aclled greentalk
-and then it was named oak
-mind you oak is a symbol of strength in many western countries 
-but they had to rename because it was a trademark by Oak Technologies 

-new name suggestions were 
	silk
	jolt
	dna
	revolutionary
	dynamic 
	java

-silk and java were the most favoured  but in the end Java was chosen for its uniqueness and most team memners just prefered it 

-Java is an island of Indonesia where the first coffee was produced (the coffee also called Java coffee)

-Java is a name not an acronym 

## Features 
### OO Paradigm
pure OO oriented 
inheritance, encapsuation, poymorphism  

### Simplicicty
easy to write, compile and debug 
though i personally think the learning curve is steep for most people 
the code is eye catching,  can actually crush on it
uses concepts of OOP languages 
data organisation is good
good keywords 

### Platform Independent 
Java is not tied to a specific machine/OS/hardware
Java code is compiled by the compiler and converted into byte code 
the byte code is platform independent 
so its
				Java Code 

	Windows JVM		Linux JVM	MAc/OS JVM
				
	then becomes 100101 and can run on

Windows 			Linux		MacOS
we can also have Java byte code for web applets, android, etc 
#### a closer look at the JVM

### Dynamic
adapt to evolving environment 
new code can be loaded on the fly without recompilation 
new features can be incorporated transparently as needed 

### Distributed
it can be transmit ie be run over the internet 
RMI & EJB are used for creating distributed applications applications 
distributed applications involves several computers connected to a network to work together 

### Interpreted 
there is no need for an interpretter to run Java code 
#### A closer look at the JVM

### RObust and secure
Java programs cant harm other systems 
secure means for Internet/web applications 
provides a secure way to access web applications 
provides the following security mechanisms 
	Classloader (seperates packages for the class from imported packages)
	Bytecode Verifier (checks code fragments for illegal code)
	Security Manager (determines resources a class can access such as reading/writing to the local disk)


## Java Virtual Machine 
abstract or virtual machine 
specification which provides runtime environment in which Java bytecode may be executed 
so the jvm functions are to 
	load code
	verify code 
	execute code 
	provide runtime environment


## Java Development Kit 
physically exists 
contains JRE and developement tools 

## Java Runtime Environment 
contains a library that provides the runtime environment 
implementation of the JVM
physicall exists                                       
                                                                                                                                                                                                                   
## Java Byte Code 
compiled program format for Java programs
MyCode.java -> |compiler| -> MyCode.class -> |interpreter| -> Java Byte Code --> MyProgram
** Compiler - program that converts program written in high level language into machine code that can be understood by the machine 
** Interpreter - program that executes code written in high level langauages without firstly compiling the code into machine understood language