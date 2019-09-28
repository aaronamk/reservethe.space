import pymongo
# pprint library is used to make the output look more pretty
from pprint import pprint

# connect to MongoDB, change the << MONGODB URL >> to reflect your own connection string
print("here")
client = pymongo.MongoClient("mongodb+srv://RyanLevent:<Spartans117>@spacereserver-sa9k0.gcp.mongodb.net/test""?retryWrites=true&w=majority")
db = client.sample_airbnb
# Issue the serverStatus command and print the results
serverStatusResult = db.command("serverStatus")
pprint(serverStatusResult)
db = client.test
print("I'm here")
