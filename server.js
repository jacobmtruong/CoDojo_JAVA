

// bring in express 
const express = require('express');
const app = express();
const port = 4000;

// make sure these lines are above any app.get or app.post code blocks
app.use(express.json());
app.use(express.urlencoded({ extended: true }));




// invoke the file and pass in 'app'
require('./routes/routes') (app);

// === OR ===

// const routes = require('./routes/routes');
// routes (app);



// this needs to be below the other code blocks
app.listen(port, () =>
    console.log(`Listening on port: ${port}`));
