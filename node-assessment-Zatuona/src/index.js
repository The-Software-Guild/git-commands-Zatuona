require('dotenv').config();
const fs = require('fs');
const express = require('express');
const app = express();
const path = require('path');
const port = 8080;
const bodyParser = require('body-parser');
const { v4: uuidv4 } = require('uuid');
const res = require('express/lib/response');
const todoFilePath = process.env.BASE_JSON_PATH;

//Read todos from todos.json into variable
const todos = require(__dirname + todoFilePath);

app.use(express.urlencoded({ extended: true }));
app.use(express.json());
app.use(express.raw());
app.use(bodyParser.json());

app.use("/content", express.static(path.join(__dirname, "public")));





app.get("/", (req, res) => {
  res.header("Content-Type", "text/html");
  res.sendFile(path.join(__dirname, './public/index.html'))
    

});





app.get("/todos", (req, res) => {

  res.header("Content-Type","application/json");
 
 res.sendFile(todoFilePath, { root: __dirname});

  res.status(200);
  

});



//Add GET request with path '/todos/overdue'


app.get('/todos/overdue', (req, res) => {
const overdueTodo = todos.filter((todo) => Date.parse(todo.due) < new Date())

res.header("Content-Type", "application/json");
res.status(200);

res.send(overdueTodo);
});


//------Add GET request with path '/todos/completed'

app.get('/todos/completed', (req, res) => {

  const completedTodo = todos.filter((todo) => todo.completed === true );

  res.header("Content-Type", "application/json");
  res.status(200);
    res.send(completedTodo)
    
});


//Add GET request with path '/todos/:id'

app.get('/todos/:id', (req, res) => {

  const findTodoById = todos.find(todo => todo.id === req.params.id);
  
  if (!findTodoById) res.status(404).send('Sorry, id not found')
  res.send(findTodoById)
  
  
  });
  


// Add POST request with path '/todos'

app.post('/todos', (req, res) => {


 const newTodo = todos.push({"id": uuidv4(), ...req.body, "created": new Date(), "completed": false})

fs.writeFile(__dirname + process.env.BASE_JSON_PATH, JSON.stringify(newTodo), err => {

  if (newTodo) {
    res.status(201);
    res.send(newTodo);
  }
  else {
    res.status(404);
    res.end();
  }
})

})


//-------Add PATCH request with path '/todos/:id

app.patch("/todos/:id", (req, res) => {
  const id = req.params.id;
  const found = todos.find((todo) => todo.id == id);
  if (!found) {
    res.status(400);
    res.send("Bad request");
    return;
  }
  const updateTodos = todos.map((todo) => {
    if (todo.id == id) {
      req.body.name && (todo.name = req.body.name);
      req.body.due && (todo.due = req.body.due);
    }
    return todo;
  });
  fs.writeFileSync(todoAbsoluteFilePath, JSON.stringify(updateTodos));
  res.status(200).send("yes!");
});


//Add POST request with path '/todos/:id/complete

app.post('/todos/:id/complete', (req, res) => {
const id = req.params.id;
const completeTodos = todos.find((todo) => {
if (todo.id === id) {
  return (todo.completed = true);
}
});

res.header("Content-Type", "application/json");
fs.writeFileSync(todoAbsoluteFilePath, JSON.stringify(todos));
  

if (completeTodos) {
res.status(200).send(completeTodos);}

else {res.status(400);}

});

//Add POST request with path '/todos/:id/undo

//Add DELETE request with path '/todos/:id

app.listen(port, function () {
    console.log(`Node server is running... http://localhost:${port}`);
});

module.exports = app;