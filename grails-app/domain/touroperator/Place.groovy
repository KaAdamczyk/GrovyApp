package touroperator

class Place {
String name
static hasMany=[trips:Trip]
static constraints = {
name (blank:false, nullable:false, size:3..30, matches:"[a-zA-Z1-9_]+")
}
String toString(){
return (name) ;
}
}
