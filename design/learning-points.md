# Learning points

## When coming up with a solution
1. Don't think of hardcoded solution, think of better ways than that. What are the implications of your solution? 
- E.g. If you create a migration file to hardcode existing users' policies receipt column as 3. What if someone else rollback the migration files? All the emails would be sent to the existing users again? 
- A better way is to filter inside the db query. 
- E.g. Payment receipt crontab interval is 5 mins, we can filter using `payment_verified_at` to be than 7.5 mins earlier than current time (~55% of crontab time).
Pass in the crontab time, and filtering time through the environment variables
