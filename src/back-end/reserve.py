import pymongo

client = pymongo.MongoClient("mongodb+srv://aaronamk:hackreserve@spacereserver-sa9k0.gcp.mongodb.net/test?retrywrites=true&w=majority")

db = client["mydatabase"]

print(client.list_database_names())

collection = db["customers"]

