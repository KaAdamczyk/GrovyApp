package touroperator

class BootStrap {

    def init = { servletContext ->
		
		def kreta = new Place(name: 'Kreta').save()
		def majork = new Place(name: 'Majorka').save()
		
		
		new Trip(date: '28.09.2018', place:kreta).save()
		new Trip(date: '27.10.2018', place:majork).save()
		
    }
    def destroy = {
    }
}
