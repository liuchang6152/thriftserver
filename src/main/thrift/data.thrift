namespace java com.liuchang.thrift

typedef i16 short
typedef i32 int
typedef i64 long
typedef bool boolean
typedef string String

struct Person{
   1:optional String username,
   2:optional int age,
   3:optional boolean married
}
struct PersonOrg{
   1:optional String orgName;
   2:optional String orgCode;
   3:optional int orgLevel;
}

exception DataException{
   1:optional String message,
   2:optional String callStack,
   3:optional String date
}

service PersonService{
   Person getPersonByUsername(1:required String username) throws(1:DataException dataException),
   void savePerson(1:required Person person) throws(1:DataException dataException)
}

service OrgService{
   PersonOrg getorgByCode(1:required String orgCode) throws(1:DataException dataException),
   void saveOrg(1:required PersonOrg personOrg) throws(1:DataException dataException)
}
