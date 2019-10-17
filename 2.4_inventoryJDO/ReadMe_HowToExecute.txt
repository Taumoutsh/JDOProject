INSTRUCTIONS TO EXECUTE THIS EXAMPLE

BY MEANS OF JDO ANNOTATIONS
1. Start MySQL
2. Start MySQL Workbench
3. Use the database script to create the database schema (inventorydb)

4. ant run (this step will launch all the previous steps needed).
(notice the name of the attributes in the inventory table)

BY MEANS OF THE PERSISTENCE METADATA XML FILE (package-my-not-in-use-sql.orm)

1. ant deleteschema (to remove the previously generated schema).
2. rename the persistence metadata file to package-mysql.orm

3. ant run


(notice the attributes in the inventory table have a different name, due to the definitions in the orm file).
