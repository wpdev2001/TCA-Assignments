This Repo contains all the assignments which has been given to us.


**Git and deployment things**

git remote set-url origin https://YOURTOKEN@github.com/wpdev2001/boot-repo.git


Main things to do:
------------------

1. git clone https://github.com/username/repo-name.git
	In order to clone particular branch of a repo
	git clone --single-branch --branch develop <repo-url>

	cd repo-name
	git status

2. check for the origin if its pointing to wrong one then remove it and add the new one
	git remote remove origin
	git remote add origin https://github.com/your-username/correct-repo.git
	git remote -v
3. creating a new branch
	git checkout -b new-feature-branch //optional(create a new branch if you want to)

4. adding it to stage env and then commiting it to local
	git add .
	git commit -m "Added new feature or changes"

5. Setting the remote token for pushing it to remote repo
	git remote set-url origin https://YOUR_TOKEN@github.com/yourusername/test-repo.git

6. pushing to the remote repo
	git push -u origin new-feature-branch
	
7. if you want to push to main repo only and if your local main is still tracking the old origin, update the tracking branch like this:
	git branch --unset-upstream
	git branch -u origin/new-branch-name

Deployment steps in podman:
===========================

[App related]
Set the application war file created in Jenkins to
/home/vone/podman/app/target/v1.war

Set the application war file created in Jenkins to
/home/vone/podman/app/system_env

Properties file created by v1 app
/home/vone/podman/app/system_env/properties

Tomcat configuration file
/home/vone/podman/app/system_env/tomcat
bin/catalina.sh
export UMASK="0022" For production log check
export JAVA_OPTS="-Xms1024m -Xmx2048m" Memory control

conf: Configuration file for Tomcat v1

Create app(v1) image
/home/vone/podman/app/app-image-create.sh

Pod operation shell
/home/vone/podman/app/bin
load: save/load image (/home/vone/podman/images)
run: start pod
stop: stop pod

[nginx]
Create nginx image
/home/vone/podman/nginx/nginx-image-create.sh

Other environment:
===================

$cd /home/vone/podman/app2
$./app-clone-branch.sh
Specify the branch you want to get and you can get the source here:
/home/vone/podman/app2/v-one

$cd /home/vone/podman/app2/v-one

Build with mvn
$mvn -Dmaven.test.skip=true clean install
v1.war can be done
in /home/vone/podman/app2/v-one/target

Copy the war
$cd /home/vone/podman/app2/target
$cp -pi /home/vone/podman/app2/v-one/target/v1.war .

Create an image
$cd /home/vone/podman/app2
$./app-image-create.sh
Specify a tag name that can be identified by the ticket name + date.
V_ONE-XX.MMDD

Example) V_ONE-29.1125
$podman image list
REPOSITORY TAG IMAGE ID CREATED SIZE
localhost/vone V_ONE-29.1125 55be16062b37 5 hours ago 411 MB

Start method
$/home/vone/podman/bin2/run
$podman image list
Top: app image
Bottom: nginx image
REPOSITORY TAG IMAGE ID CREATED SIZE
localhost/vone V_ONE-29.1125 55be16062b37 5 hours ago 411 MB
localhost/nginx v1.24 794b2006dd24 2 weeks ago 465 MB

$./pod_run.sh
V_ONE-29.1125
v1.24
=>
Start
$podman ps -a
CONTAINER ID IMAGE COMMAND CREATED STATUS PORTS NAMES
f10dd19ca4a8 localhost/podman-pause:4.4.1-1692279033 5 hours ago Up 5 hours 10.112.62.42:15080->15080/tcp 062613818e75-infra
0b8de92185d6 localhost/vone:V_ONE-29.1125 catalina.sh run 5 hours ago Up 5 hours 10.112.62.42:15080->15080/tcp vone2
af4392945daf localhost/nginx:v1.24 /sbin/init 5 hours ago Up 5 hours 10.112.62.42:15080->15080/tcp nginx2

How to stop
$cd /home/vone/podman/bin2/stop
$./pod_stop.sh

config file
$cd /home/vone/conf2/app
v1-config.xml
level3


Reboot after making changes

****Switching from L1/L2 to L3 or vice versa** **

Go to $cd /home/vone/conf2/app.

If you want to switch to L1/L2

cp v1-config_vonel2ora.xml v1-config.xml

If you want to switch to L3,
cp v1-config_voneora.xml v1-config.xml

$cd /home/vone/podman/bin2/stop
$./pod_stop.sh

$/home/vone/podman/bin2/run
$podman image listTop
: app imageBottom
: nginx imageREPOSITORY
TAG IMAGE ID CREATED SIZE
localhost/vone V_ONE-29.1125 55be16062b37 5 hours ago 411 MB
localhost/nginx v1.24 794b2006dd24 2 weeks ago 465 MB

$./pod_run.sh
V_ONE-29.1125
v1.24
