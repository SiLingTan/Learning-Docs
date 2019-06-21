## Introduction to Redux

- Redux limit how our data can be modified, so that our application complexity does not grow exponentially (as the app grows in size). 

### Example: 
```javascript
console.clear()

// A store is a collection of action creators and reducers. 

// Action creator. 
const createPolicy = (name, amount) => {
  return {
    // Action.
    type: 'CREATE_POLICY', 
    payload: {
      name, 
      amount
    }
  };
};

// Action creator.
const deletePolicy = (name) => {
  return {
    // Action. 
    type: 'DELETE_POLICY', 
    payload: {
      name
    }
  };
};

// Action creator. 
const createClaim = (name, amount) => {
  return {
    // Action. 
    type: 'CREATE_CLAIM', 
    payload: {
      name, 
      amount
    }
  };
};

// Reducers.

// Default the initial value of claims with [].
const claimsHistory = (oldListOfClaims = [], action) => {
   if (action.type === 'CREATE_CLAIM') {
     // Create a new array and add the item in the array. 
     // Always create a new array instead of modifying an existing array. 
     return [...oldListOfClaims, action.payload];
   }
  
  return oldListOfClaims;
}; 

const accounting = (bagOfMoney = 100, action) => {
  if (action.type == 'CREATE_CLAIM') {
    return bagOfMoney - action.payload.amount
  } else if (action.type == 'CREATE_POLICY') {
    return bagOfMoney + action.payload.amount
  }
  
  return bagOfMoney
}

const policies = (listOfPolicies = [], action) => {
  if (action.type == 'CREATE_POLICY') {
    return [...listOfPolicies, action.payload.name]
  } else if (action.type == 'DELETE_POLICY') {
    return listOfPolicies.filter(policyName => policyName !== action.payload.name)
  }
  
  return listOfPolicies
}

// Using Redux. 
const {createStore, combineReducers} = Redux;

// Create a store of reducers. 
const ourDepartments = combineReducers({
  policies, 
  claimsHistory, 
  accounting
})
const store = createStore(ourDepartments);

// Create a policy action. 
const action = createPolicy('Janice', 20);
//console.log(action);

// Dispatcher would pass the action to each of the reducers. 
store.dispatch(action);

// Get the current state of the application. 
console.log(store.getState());

// Create a claim and dispatch it to all reducers. 
store.dispatch(createClaim('Janice', 80));

// Get the current state of the application. 
console.log(store.getState());

// Delete a policy. 
store.dispatch(deletePolicy('Janice'));

// Get the current state of the application. 
console.log(store.getState());

```

### Reference 
- [Udemy course by Stephen Grider](https://www.udemy.com/react-redux/learn/lecture/12531416#overview)
