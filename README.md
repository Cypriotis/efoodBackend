
E-food HUA Clone

E-food HUA Clone is a clone version of the food delivery ‘e-food’ company that is based in Greece!

Installation(Back-end)

update apt package lists and repositories with this command:

sudo apt update                                               

use apt to install Apache Web server with this command:

sudo apt install apache2 -y                                   

use apt to install MySQL server package with this command:

apt install mysql-server -y                                   

verify successful installation with this command:

mysql -V                                                      


**To monitor Apache Web server and MySQL database server we recommend the following (Link): 

https://vitux.com/ubuntu-xampp/

Installation(Front-end)

install NVM with this command:

curl -o- https://raw.githubusercontent.com/nvm-sh/nvm/v0.35.3/install.sh | bash

check installation with this command:

nvm –version                                                                                             

install NodeJS with these commands:

nvm install 14.4.0                                                                                           

curl -sL https://deb.nodesource.com/setup_14.x | sudo -E bash -               

sudo apt-get install -y nodejs                                                                            

check node version with this command:

npm version                                                                                                      



Back-end Repository (Github Link)

**link**

Front-end Repository (Github Link)

**link**



How to run the application:

    1. Execute the following command :sudo /opt/lampp/manager-linux-x64.run
       Go to → Manage Servers catalog and start the servers
    1. Open Back-end Project and execute the application
       Now the API and Database should be running
    2. Open Front-end Project and execute the npm start command on the command line
       Now the Front-end react project should be running on http://localhost:3000/
    

API DOCUMENTATION : https://documenter.getpostman.com/view/17897813/2s8ZDSckYQ














