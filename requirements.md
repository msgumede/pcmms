# App Specifications
- Have register & login functionality.
- Application cannot be accessed without registering & logging in.


# Roles Specification
## _Member:_
- Has unique I.D
- Register with unique phone number, a name and a password.
- Log in with name/phone number and password
- Create record, view records.
- Can only delete & updated their own records.
  
## _Admin:_
- Create, read, updated and delete any record


# Records Specification
## _Metadata (Data fields):_
- Has foreign key as an I.D
- Name/Initials field
- Status field (prospective, regular, baptised & deceased)
- Notes field

## _Other:_
- When a record is updated, the changes should be logged, past data/information should not be erased. This is for data analysis purposes.
- If the user who created the record gets deleted, the record should not be deleted. Deletion of record owner should not cascade.
  