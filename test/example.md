## Example  

#### Scenario, Given, When, Then, And

```
// Scenario: Creating new oracle event
// Given a new event,
// When the client calls the endpoint with a new event,
// Then the event will be validated
// And the event will be stored.

// Scenario: Validating flight delay event
// Given a new flight delay event
// When the event is valid/invalid
// Then it should be return true/false.

// Scenario: Validating flight cancellation event
// Given a new flight cancellation event
// When the event is valid/invalid
// Then it should be return true/false.

// Scenario: Processing oracle event for valid flight-delay
// Given a list of stored events,
// When the events conditions matches the policies,
// Then an email should be send,
// And the event will be marked as processed.
```
