package touroperator

class Trip {
String date
static belongsTo=[place:Place]
static constraints = {
date(blank:false, nullable: false, size:3..80)
}
String toString(){
return date;
}
}