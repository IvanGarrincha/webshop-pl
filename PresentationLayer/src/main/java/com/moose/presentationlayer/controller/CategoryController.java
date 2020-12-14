package com.moose.presentationlayer.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.moose.domainmodel.data.products.Author;
import com.moose.domainmodel.data.products.Book;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/category/{catname}")
public class CategoryController {

	@Autowired
	DataService service;
	
	@GetMapping
	public String getBooks(Model model, @PathVariable String catname) {
		log.info("name: "+ catname);
		model.addAttribute("categoryName", catname);
		
		List<Book> books = service.getBooks();
		model.addAttribute("books", books);
		


		return "categoryBooks";
	}
	
	
	
	
	
	public List<Book> getBooks() {
		List<Book> books = new ArrayList<>();
		log.info("returning book list of: "+ books.size() + " items.");
//		Author jan = new Author("Jan Skansholm");
//		Author scott = new Author("Scott Oaks");
//		Author jonas = new Author("Jonas Lindemann");
//		Author bob = new Author("Robert C. Martin");
//		Author anaya = new Author("Mariano Anaya");
//		Author mario = new Author("Mario Casciaro");
//		Author valle = new Author("Valentin Bojinov");
//		Author gamma = new Author("Erich Gamma");
//		Author helm = new Author("Richard Helm");
		
//		Category cpp = new Category("C++");
//		Category java = new Category("Java");
//		Category python = new Category("Python");
//		Category programming = new Category("Programming");
//		Category designPatterns = new Category("Design Patterns");
//		Category node = new Category("Node.js");
//		Category webapp = new Category("Web Programming");
		
		
		
		Book cppDirekt = new Book("9789144076034", "C++ Direkt", 											2011, 564.0, new Author("b"));
		
		cppDirekt.setDescription("Denna upplaga av C++ direkt är baserad på den standard för C++ som togs fram 2011. Hela C++ beskrivs i boken – från de allra enklaste ting till de mest avancerade konstruktionerna. Även det bibliotek med generiska standardklasser och standardalgoritmer som ingår i standarden beskrivs utförligt.Boken följer den enkla principen: Programmera i C++ direkt! Den förutsätter inte att man tidigare kan C eller något annat programspråk.C++ direkt vänder sig både till nybörjare i inledande kurser i programmeringsteknik och till läsare med tidigare programmeringserfarenhet.C++ direktär lättläst och pedagogiskbeskriver även avancerade konstruktioner i C++behandlar nya konstruktioner från den standard som togs fram 2011använder de generiska standardklasserna som en naturlig del av språketbehandlar objektorienterad programutvecklingdiskuterar datastrukturer och algoritmerinnehåller en mängd exempel och övningar");
		
		
		Book javaPerformance = new Book("9781492056119", "Java Performance", 										2020, 452.0, new Author("b"));
		
		javaPerformance.setDescription("Coding and testing are generally considered separate areas of expertise. In this practical book, Java expert Scott Oaks takes the approach that anyone who works with Java should be adept at understanding how code behaves in the Java Virtual Machine-including the tunings likely to help performance. This updated second edition helps you gain in-depth knowledge of Java application performance using both the JVM and the Java platform.Developers and performance engineers alike will learn a variety of features, tools, and processes for improving the way the Java 8 and 11 LTS releases perform. While the emphasis is on production-supported releases and features, this book also features previews of exciting new technologies such as ahead-of-time compilation and experimental garbage collections.Understand how various Java platforms and compilers affect performanceLearn how Java garbage collection worksApply four principles to obtain best results from performance testingUse the JDK and other tools to learn how a Java application is performingMinimize the garbage collector's impact through tuning and programming practicesTackle performance issues in Java APIsImprove Java-driven database application performance");
		
		Book guidePython = new Book("9789144126739", "Ingenjörens guide till Python", 						2019, 366.0, new Author("b") );
		
		guidePython.setDescription("Bokens utgångspunkt är ingenjörens behov av programmering för att lösa problem. Steg för steg byggs läsarens kunskaper upp i Python-programmering. Mot slutet av boken kommer läsaren att ha grundläggande kunskaper i utveckling av Python-program för lösning av numeriska problem, grundläggande visualisering av data samt att skapa grafiska gränssnitt för användare. Alla koncept som beskrivs i boken illustreras med en stor mängd körbara exempel. Ingenjörens guide till Python innehåller också en mängd övningsuppgifter att göra på egen hand. Till boken finns en hemsida där all källkod från boken finns tillgänglig att ladda ner och köra. Boken är avsedd som en introduktion till programmering med Python för ingenjörer, men kan även med fördel användas för praktiserande ingenjörer som vill lära sig mer om hur Python kan användas som alternativ till klassiska verktyg som exempelvis MATLAB.");
		
		Book cleanCode = new Book("9780132350884", "Clean Code", 											2008, 329.0, new Author("b"));
		
		cleanCode.setDescription("Even bad code can function. But if code isn't clean, it can bring a development organization to its knees. Every year, countless hours and significant resources are lost because of poorly written code. But it doesn't have to be that way. Noted software expert Robert C. Martin, presents a revolutionary paradigm with Clean Code: A Handbook of Agile Software Craftsmanship. Martin, who has helped bring agile principles from a practitioner's point of view to tens of thousands of programmers, has teamed up with his colleagues from Object Mentor to distill their best agile practice of cleaning code \"on the fly\" into a book that will instill within you the values of software craftsman, and make you a better programmer-but only if you work at it. What kind of work will you be doing? You'll be reading code-lots of code. And you will be challenged to think about what's right about that code, and what's wrong with it. More importantly you will be challenged to reassess your professional values and your commitment to your craft. Clean Code is divided into three parts. The first describes the principles, patterns, and practices of writing clean code. The second part consists of several case studies of increasing complexity. Each case study is an exercise in cleaning up code-of transforming a code base that has some problems into one that is sound and efficient. The third part is the payoff: a single chapter containing a list of heuristics and \"smells\" gathered while creating the case studies. The result is a knowledge base that describes the way we think when we write, read, and clean code. Readers will come away from this book understanding How to tell the difference between good and bad code How to write good code and how to transform bad code into good code How to create good names, good functions, good objects, and good classes How to format code for maximum readability How to implement complete error handling without obscuring code logic How to unit test and practice test-driven development What \"smells\" and heuristics can help you identify bad codeThis book is a must for any developer, software engineer, project manager, team lead, or systems analyst with an interest in producing better code");
		
		Book cleanPython = new Book("9781788835831", "Clean Code in Python", 									2018, 406.0, new Author("b"));
//		cleanPython.addCategory(python);
//		cleanPython.addCategory(programming);
		cleanPython.setDescription("Getting the most out of Python to improve your codebase\n"
				+ "\n"
				+ "Key Features\n"
				+ "Save maintenance costs by learning to fix your legacy codebase\n"
				+ "Learn the principles and techniques of refactoring\n"
				+ "Apply microservices to your legacy systems by implementing practical techniques\n"
				+ "Book Description\n"
				+ "Python is currently used in many different areas such as software construction, systems administration, and data processing.\n"
				+ "\n"
				+ "In all of these areas, experienced professionals can find examples of inefficiency, problems, and other perils, as a result of bad code. After reading this book, readers will understand these problems, and more importantly, how to correct them.\n"
				+ "\n"
				+ "The book begins by describing the basic elements of writing clean code and how it plays an important role in Python programming. You will learn about writing efficient and readable code using the Python standard library and best practices for software design. You will learn to implement the SOLID principles in Python and use decorators to improve your code. The book delves more deeply into object oriented programming in Python and shows you how to use objects with descriptors and generators. It will also show you the design principles of software testing and how to resolve software problems by implementing design patterns in your code. In the final chapter we break down a monolithic application to a microservice one, starting from the code as the basis for a solid platform.\n"
				+ "\n"
				+ "By the end of the book, you will be proficient in applying industry approved coding practices to design clean, sustainable and readable Python code.\n"
				+ "\n"
				+ "What you will learn\n"
				+ "Set up tools to effectively work in a development environment\n"
				+ "Explore how the magic methods of Python can help us write better code\n"
				+ "Examine the traits of Python to create advanced object-oriented design\n"
				+ "Understand removal of duplicated code using decorators and descriptors\n"
				+ "Effectively refactor code with the help of unit tests\n"
				+ "Learn to implement the SOLID principles in Python\n"
				+ "Who this book is for\n"
				+ "This book will appeal to team leads, software architects and senior software engineers who would like to work on their legacy systems to save cost and improve efficiency. A strong understanding of Programming is assumed.\n"
				+ "\n"
				+ "");
		
		Book nodeJsDesingPatterns = new Book("9781839214110","Node.js Design Patterns",								2020, 441.0, new Author("b"));
		
		nodeJsDesingPatterns.setDescription("Learn proven patterns, techniques, and tricks to take full advantage of the Node.js platform. Master well-known design principles to create applications that are readable, extensible, and that can grow big.\n"
				+ "\n"
				+ "Key Features\n"
				+ "Learn how to create solid server-side applications by leveraging the full power of Node.js 14\n"
				+ "Understand how Node.js works and learn how to take full advantage of its core components as well as the solutions offered by its ecosystem\n"
				+ "Avoid common mistakes and use proven patterns to create production grade Node.js applications\n"
				+ "Book Description\n"
				+ "In this book, we will show you how to implement a series of best practices and design patterns to help you create efficient and robust Node.js applications with ease.\n"
				+ "\n"
				+ "We kick off by exploring the basics of Node.js, analyzing its asynchronous event driven architecture and its fundamental design patterns. We then show you how to build asynchronous control flow patterns with callbacks, promises and async/await. Next, we dive into Node.js streams, unveiling their power and showing you how to use them at their full capacity. Following streams is an analysis of different creational, structural, and behavioral design patterns that take full advantage of JavaScript and Node.js. Lastly, the book dives into more advanced concepts such as Universal JavaScript, scalability and messaging patterns to help you build enterprise-grade distributed applications.\n"
				+ "\n"
				+ "Throughout the book, you'll see Node.js in action with the help of several real-life examples leveraging technologies such as LevelDB, Redis, RabbitMQ, ZeroMQ, and many others. They will be used to demonstrate a pattern or technique, but they will also give you a great introduction to the Node.js ecosystem and its set of solutions.\n"
				+ "\n"
				+ "What you will learn\n"
				+ "Become comfortable with writing asynchronous code by leveraging callbacks, promises, and the async/await syntax\n"
				+ "Leverage Node.js streams to create data-driven asynchronous processing pipelines\n"
				+ "Implement well-known software design patterns to create production grade applications\n"
				+ "Share code between Node.js and the browser and take advantage of full-stack JavaScript\n"
				+ "Build and scale microservices and distributed systems powered by Node.js\n"
				+ "Use Node.js in conjunction with other powerful technologies such as Redis, RabbitMQ, ZeroMQ, and LevelDB\n"
				+ "Who this book is for\n"
				+ "This book is for developers and software architects who have some prior basic knowledge of JavaScript and Node.js and now want to get the most out of these technologies in terms of productivity, design quality, and scalability. Software professionals with intermediate experience in Node.js and JavaScript will also find valuable the more advanced patterns and techniques presented in this book.\n"
				+ "\n"
				+ "This book assumes that you have an intermediate understanding of web application development, databases, and software design principles.\n"
				+ "\n"
				+ "Författare: Mario Casciaro\n"
				+ "Undertitel: Design and implement production-grade node.js applications using proven patterns and techniques, 3rd edition\n"
				+ "ISBN: 9781839214110\n"
				+ "Språk: Engelska\n"
				+ "Utgiven: 2020-07-01\n"
				+ "Förlag: Packt Publishing Limited\n"
				+ "Antal sidor: 660\n"
				
				+ "");
		Book nodeJs = new Book("9781788623322","RESTful Web API Design with Node.js 10, Third Edition",  2018, 259.0, new Author("b"));
		
		
		nodeJs.setDescription("Design and implement scalable and maintainable RESTful solutions with Node.js 10\n"
				+ "\n"
				+ "Key Features\n"
				+ "Create rich and scalable RESTful API solutions from scratch\n"
				+ "Explore the new features of Node.js 10, Express 4.0, and MongoDB\n"
				+ "Integrate MongoDB in your Node.js application to store and secure your data\n"
				+ "Book Description\n"
				+ "When building RESTful services, it is really important to choose the right framework. Node.js, with its asynchronous, event-driven architecture, is exactly the right choice for building RESTful APIs.\n"
				+ "\n"
				+ "This third edition of RESTful Web API Design with Node.js 10 will teach you to create scalable and rich RESTful applications based on the Node.js platform. You will be introduced to the latest NPM package handler and understand how to use it to customize your RESTful development process. You will begin by understanding the key principle that makes an HTTP application a RESTful-enabled application. After writing a simple HTTP request handler, you will create and test Node.js modules using automated tests and mock objects; explore using the NoSQL database, MongoDB, to store data; and get to grips with using self-descriptive URLs. You'll learn to set accurate HTTP status codes along with understanding how to keep your applications backward-compatible. Also, while implementing a full-fledged RESTful service, you will use Swagger to document the API and implement automation tests for a REST-enabled endpoint with Mocha. Lastly, you will explore some authentication techniques to secure your application.\n"
				+ "\n"
				+ "What you will learn\n"
				+ "Install, develop, and test your own Node.js user modules\n"
				+ "Understand the differences between HTTP and RESTful applications\n"
				+ "Use self-descriptive URLs and set accurate HTTP status codes\n"
				+ "Eliminate third-party dependencies in your tests with mocking\n"
				+ "Implement automation tests for a REST-enabled endpoint with Mocha\n"
				+ "Secure your services with NoSQL database integration within Node.js applications\n"
				+ "Integrate a simple frontend using JavaScript libraries available on a CDN server\n"
				+ "Who this book is for\n"
				+ "If you are a web developer keen to enrich your development skills to create server-side RESTful applications based on the Node.js platform, this book is for you. Some knowledge of REST would be an added advantage, but is definitely not a necessity.");
		
		Book designPatternsBook = new Book("9780201633610","Desgin Patterns", 										1994, 573.0, new Author("b"));
		
		
		designPatternsBook.setDescription("Capturing a wealth of experience about the design of object-oriented software, four top-notch designers present a catalog of simple and succinct solutions to commonly occurring design problems. Previously undocumented, these 23 patterns allow designers to create more flexible, elegant, and ultimately reusable designs without having to rediscover the design solutions themselves. The authors begin by describing what patterns are and how they can help you design object-oriented software. They then go on to systematically name, explain, evaluate, and catalog recurring designs in object-oriented systems. With Design Patterns as your guide, you will learn how these important patterns fit into the software development process, and how you can leverage them to solve your own design problems most efficiently. Each pattern describes the circumstances in which it is applicable, when it can be applied in view of other design constraints, and the consequences and trade-offs of using the pattern within a larger design. All patterns are compiled from real systems and are based on real-world examples. Each pattern also includes code that demonstrates how it may be implemented in object-oriented programming languages like C++ or Smalltalk.\n"
				+ "Författare: Erich Gamma\n"
				+ "Undertitel: Elements of reusable object-oriented software\n"
				+ "ISBN: 9780201633610\n"
				+ "Språk: Engelska\n"
				+ "Vikt: 885 gram\n"
				+ "Serie: Addison-Wesley Professional Computing Series\n"
				+ "Utgiven: 1994-10-01\n"
				+ "Förlag: Addison Wesley\n"
				+ "Antal sidor: 416\n"
				+ "");
		
		
		books.add(cppDirekt);
		books.add(javaPerformance);
		log.info("book added: "+ books.size());
		books.add(guidePython);
		books.add(cleanCode);
		books.add(cleanPython);
		books.add(nodeJsDesingPatterns);
		books.add(nodeJs);
		books.add(designPatternsBook);
		return books;
	}
	
}
