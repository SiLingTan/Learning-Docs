# Slack

### Posting messages onto slack channel

#### Simple way

```golang
api := slack.New(slackToken)
attachment := slack.Attachment{
  Pretext: "some pretext",
  Text:    "some text",
  Fields: []slack.AttachmentField{
    slack.AttachmentField{
      Title: "attachment1",
      Value: "value1",
    },
  },
}

channelID, timestamp, err := api.PostMessage(channelID, slack.MsgOptionText("Msg option text", true), slack.MsgOptionAttachments(attachment))
if err != nil {
  fmt.Println(err.Error())
}
fmt.Printf("Message successfully posted to channel %s at %s", channelID, timestamp)
```


### Reference
- [Slack Messages](https://github.com/nlopes/slack/blob/master/examples/messages/messages.go)
- [Slack API](https://api.slack.com/methods/chat.postMessage)
