//-VISIBLE
open class Animal {
	open var espèce = "Animal"
    override fun toString() : String {
        return espèce;
    }
}
class Guépard : Animal() {
	override var espèce = "Guépard"
}
class Perroquet : Animal() {
	override var espèce = "Perroquet"
}
class Poule : Animal() {
	override var espèce = "Poule"
}
class Souris : Animal() {
	override var espèce = "Souris"
}
class Zèbre : Animal() {
	override var espèce = "Zèbre"
}
//+VISIBLE
fun main(){

	// Nombre d'animaux
    val nb_animaux = readln().toInt()

	// Liste d'animaux
    val animaux = mutableListOf<Animal>()

	// Instancie les objets animaux
    for( i in 0 until nb_animaux ) {
        //+TODO
        animaux.add( Souris() )
        //-TODO
    }

	// Affiche les animaux en ordre d'espèce
    for( animal in animaux.sortedBy{ it.espèce } ){
        println( animal )
    }
}
