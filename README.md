learning-mongodb
=======

####  Setup mongo:  
   
    $ curl -O https://fastdl.mongodb.org/linux/mongodb-linux-x86_64-3.2.21.tgz
 
    $ tar -zxvf mongodb-linux-x86_64-3.2.21.tgz
    $ mkdir -p mongodb
    $ cp -R -n mongodb-linux-x86_64-3.2.21/ mongodb
    $ vi ~/.bashrc
       // add this line
     export PATH="/home/satendra/tools/mongodb/mongodb-linux-x86_64-3.2.21/bin:$PATH"

    $ sudo mkdir /data
 
    $ sudo chown satendra:satendra  /data
    $ mkdir -p /data/db

#### Start server:

            $ mongod  
             
   
#### Start client 

     $ mongo --host 127.0.0.1:27017
  
  
#### Clone Project:

      $ git clone git@github.com:techmonad/learning-mongodb.git
      
      $ cd learning-mongodb
      
      $ sbt clean compile
  
