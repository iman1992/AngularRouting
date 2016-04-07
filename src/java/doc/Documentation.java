/**
 * 
 * Describe the term Single Page Application and why it's relevant for modern web-applications.
 * 
 * An SPA is a web application that forgoes the older structure of web applications, wherein every page on the website is a separate file that the user is required to request and load in order to see the other pages. An SPA however is a web application in which the default page of the website is the only one, and instead of loading new pages in, it instead injects partial HTML pages into a container in the DOM. 
 * 
 * 
 * Describe how SPA's are implemented with AngularJS
 * 
 * Through the use of Routing. We have the HTML partials laying in wait with their own controllers and the like, and when called upon, then URI is appended with a /#/ and then the name of the partial, loading the partial into the DOM of the main page. 
 * 
 * 
 * Explain about the following "building blocks" and purpose in Angular: Controllers, Directives, Services, Filters
 * 
 * Controllers are basically the control layers of a page, handling the functionality and actions of the page. Functions, data access and the like. Directives are used to create your own DOM HTML tags in order to make reusable forms and the like much more easily. Services are basically the same as Factories, except they're not as flexible. Services are always objects, whereas Factories can be objects, functions, etc. Filters are basically that, custom filters you can use to quickly filter some specific values on your page.
 * 
 * 
 * Explain about Routing in AngularJS
 * 
 * Routing in AngularJS is done through app.config with $routeProvider. You use the when() function to say what is supposed to happen and what is supposed to be loaded into the DOM when a specific page is being redirected to, as well as which controllers to take in use.
 * 
 */