# DevOpsDemo

This is a demo project to learn how a pipeline works. 
Try deploying the demo to an AWS EC2 instance by using AWS CodePipeline, 
CodeBuild and CodeDeploy. 

Follow the steps below to deploy the code. 

## Step 1: Create a VM
Create a virtual machine on AWS called an "EC2 instance". 
Read the steps in [this guide](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EC2_GetStarted.html) to get started.
Or just google "Create EC2 AWS" to find other guides you might perfer :) 

## Step 2: Give your VM a role
Create an IAM role for the EC2 machine. The IAM role needs to have the 
following policy:
*AmazonEC2RoleforAWSCodeDeploy*. It will give your EC2 the right permissions
allowing you to deploy code to the machine. To learn how to create an IAM
role and policy use [this guide](https://docs.aws.amazon.com/codedeploy/latest/userguide/getting-started-create-iam-instance-profile.html).

Use the part saying "Create an IAM instance profile for your 
Amazon EC2 instances (console)". You can create your own policy
as the guide says. Or you can use a policy created by AWS already,
in this case *AmazonEC2RoleforAWSCodeDeploy*.  

IAM roles and policies are difficult to understand in the beginning! 
Don't get discouraged if it does not make any sense :) 

## Step 3: Install Java on the VM
Your VM is a clean slate right now. It is like a new computer that has
almost nothing installed on it. In order to run the jar file deployed to
it you need to install Java. 

Connect to your EC2 and use the following command to install Java:
`sudo amazon-linux-extras install java-openjdk11`

If you don't know how to SSH to an EC2 use
[this guide](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-connect-methods.html).

## Step 4: Install the CodeDeploy agent on your VM
In addition to Java, you need something called a "CodeDeploy agent"
to be able to do deployments. 

Install the agent using the following commands.
These commands assume you are running Amazon Linux on your VM and
that you are in the EU West 1 region (like Ireland). 

```
sudo yum install ruby

sudo yum install wget

cd /home/ec2-user

wget https://aws-codedeploy-eu-west-1.s3.eu-west-1.amazonaws.com/latest/install

chmod +x ./install

sudo ./install auto

```

Use this command to make sure your CodeDeploy agent is runnign:

```
sudo service codedeploy-agent status
```








