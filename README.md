For information about configuring webhooks on your github repo, see:
https://docs.github.com/en/free-pro-team@latest/developers/webhooks-and-events/creating-webhooks

If Testing locally, see: 
https://docs.github.com/en/free-pro-team@latest/developers/webhooks-and-events/configuring-your-server-to-receive-payloads
(You will modify the hook url to be an ngrok domain)

When creating the hook, set the url to be: your-domain/github/hooks/prcomment

Add a secret if you'd like to secure the endpoint with a the secret passed in each header.

For "Which events would you like to trigger this webhook":
1.  Select "Let me select individual events"
2. Uncheck "Pushes"
3. Check "Pull Request Review Comments"
4. Leave Active at the bottom checked

Configuring The App:
This app uses Lombok to define pojo and request getters, setters, and builders. If using Intellij, ensure that you have:
1. Downloaded Lombok plugin in the Intellij plugin marketplace
2. "Enable Annotation Processing" within Intellij preferences under Annotation Processing within Build, Execution, Deployment
3. A restart of Intellij may be required to get Intellij to recognize the annotations

Add your secret to application.properties by modifying the github.hook.prcomment.secret variable
(You can leave as "None" if you do not use a secret)


Customizing the events:
To add/modify what data is received in the push event, see:
https://docs.github.com/en/free-pro-team@latest/developers/webhooks-and-events/webhook-events-and-payloads#issue_comment

