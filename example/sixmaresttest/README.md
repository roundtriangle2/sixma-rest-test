

REST api using spring and h2 database

Some fields have processing done prior to frontend output
or being input ton the database.

The ssn is a sensitive piece of information it can be hashed
rather than encrypted as hashing is an irreversible method

A salt can be used in order to increase the randomness in the ssn
hash, however an attacker with access to the database can, given enough computational power
can trivially get the ssn cleartext as these are sequential values than can easily be generated

The ssn is stored in cleartext in this build for demonstration purposes only, however
a production build MUST NOT

Ideally we would only  display the last 4 digits of the ssn and have the user enter all 9
numbers when updating.

Without further context it is impossible to determine what
technique to should be used to store the ssn in this demonstration scenario
It was determined that, like the rejection of all non-authenticated requests, safe ssn handling procedures where out of the scope of this demonstration,
so I chose to handle it was plain text. 


More improvements can be made such as server side validation, rejecting non-authenticated requests, safe ssn handling procedures, logging, etc, 
but I believe the current implementation is sufficient for this demonstration

