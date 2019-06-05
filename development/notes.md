## Notes 

Learning points
1. Deployments:  
  - If checkin .env file changes into develop branch, remember to update AWS environment variables in elastic beanstalk application. 
  Example: `api-staging` and `api-mainnet` (staging and production environments)
  - Need to regularly deploy into prod env (cannot be 100commits away).
  - Everything in develop can be deployed and merge into master (dont need to ask).
  
2. Get endpoints don't need to log out errors, only create/update/delete endpoints need. 

3. Endpoints: 
  ```
  PUT if it update existing row
  POST if it creates a new row
  ```
  
4. Naming conventions: 
```
Filename and model name: singular
```
