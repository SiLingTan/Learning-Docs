# :star: Cron job 

1. Always validate your cron time on `https://crontab.guru/`.
    - If crontab guru validator says the crontab is wrong, double check your syntax!

2. If the cron job is a daily job, think about what time should it be running. Server time is in UTC. 
If we want it to run every day at 12am (00:00:00) SGT, then we should set the cron job to run daily at 4pm UTC. 

Example: 
```bash
# Every day at 00:00:00 SGT
ORACLE_CRON_TAB=0 16 * * *

# Every 5 minutes
PURCHASE_EMAIL_CRON_TAB=*/5 * * * *
```


## References
- [Cron Tab Syntax](https://crontab.guru/examples.html)
- [UTC Timezone Converter](http://www.timebie.com/timezone/universalsingapore.php)
