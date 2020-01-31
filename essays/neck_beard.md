---
layout: essay
type: essay
title: How to ask a neck beard a question
# All dates must be YYYY-MM-DD format!
date: 2020-01-30
labels:
  - Software Engineering
  - Asking Questions
  - Getting Help
  - Git Hub
---

<img class="ui medium right floated rounded image" src="https://i.imgur.com/jZRmKG4.jpg">

## Things to do

When asking a question is good practice to consider, the person that you except to answer your question.  Things that might seem okay to do when asking a friend or classmate, might not be appropriate to ask a stranger on the internet as conveyed concisely by Eric Raymond in his article “How to ask questions the smart way.”  Once you get past the fact that Mr. Raymond neckbeard fedora personality, it is a great source for understanding how questions need to be phrased so that a ‘hacker’ might help you.  Some of the more useful tips provided include how to ask questions on code:

“Don't ask others to debug your broken code without giving a hint what sort of problem they should be searching for. Posting a few hundred lines of code, saying "it doesn't work", will get you ignored. Posting a dozen lines of code, saying "after line 7 I was expecting to see <x>, but <y> occurred instead" is much more likely to get you a response.”

## Not so smart questions

Following the examples laid out by in the article, an example of a not smart question found on stack overflow is as follows: “I have a c program with some functions and a unit test file to test them. How can I run the unit test file by command line on Linux?”  While this person may have done research and turned up nothing, this is not immediately obvious.  As a result it seems as though this person has done no research prior to posting their question.  As Raymond puts it, when someone reads this, whether they reply or not, they are probably thinking this person “should have Searched The Fucking Web.”

[Source](https://stackoverflow.com/questions/59995458/how-can-i-run-a-unit-test-file-by-command-line-in-c)

## Smart questions

We can also use this article to find smart questions, a good question is much more likely to receive a good answer.  A smart question will not only state the problem, but also the work that has been done to solve the problem.  A good example of this is as follows:
“I have a function foo which makes an Ajax request. How can I return the response from foo?
I tried returning the value from the success callback as well as assigning the response to a local variable inside the function and returning that one, but none of those ways actually return the response.”

```javascript
function foo() {
    var result;

    $.ajax({
        url: '...',
        success: function(response) {
            result = response;
            // return response; // <- I tried that one as well
        }
    });

    return result;
}

var result = foo(); // It always ends up being `undefined`.
```

[Source](https://stackoverflow.com/questions/14220321/how-do-i-return-the-response-from-an-asynchronous-call)

Not only does this person provide the steps that they took to solve the error, they also provided the least amount of code that they believe is necessary to understand the situation.  This gives the reader a sense that the asker has already done all that they can to find a solution before asking the question.  In general, it is not hard to ask smart questions, all it takes is the willingness to put in at least the work that you are asking of others.
