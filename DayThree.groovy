class DayThree {

    static Integer HousesDelivery(String directions) {
        def listaDeCasesEntragadas = [[0, 0]]
        Integer y = 0
        Integer x = 0
        directions.each { p ->
            if (p == '^') { y++ }
            if (p == 'v') { y-- }
            if (p == '>') { x++ }
            if (p == '<') { x-- }
            listaDeCasesEntragadas.add([y, x])
        }
        listaDeCasesEntragadas.unique().size()
    }

}
