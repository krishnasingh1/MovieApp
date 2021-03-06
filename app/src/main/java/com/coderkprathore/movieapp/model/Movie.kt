package com.coderkprathore.movieapp.model

data class Movie(val id : String,
                 val title : String,
                 val year : String,
                 val genre : String,
                 val director : String,
                 val actors : String,
                 val plot : String,
                 val poster : String,
                 val image : List<String>,
                 val rating : String,)

fun getMovies() : List<Movie> {
    return listOf(
        Movie(id = "tt0499548",
        title = "Avatar",
        year = "2009",
        genre = "Action, Adventure, Fantasy",
        director = "James Cameron",
        actors = "Sam Worthington, Zoe Saldana, Sigourney Weaver, Stephen Lang ",
        plot ="",
        poster ="https://www.imdb.com/title/tt0499549/mediaviewer/rm3487863553/?ref_=tt_ov_i",
        image = listOf("https://static.wikia.nocookie.net/whumpapedia/images/1/19/Avatar.jpg/revision/latest?cb=20210325190232",),
        rating = "7.9"),
        Movie(id = "tt0499549",
            title = "300",
            year = "2009",
            genre = "Action, Adventure, Fantasy",
            director = "James Cameron",
            actors = "Sam Worthington, Zoe Saldana, Sigourney Weaver, Stephen Lang ",
            plot ="",
            poster ="http://gonewiththetwins.com/new/wp-content/uploads/2014/01/avatar.jpg",
            image = listOf("https://resizing.flixster.com/WPGXy6U0bxJt7RhgJUbOSAZxAoU=/206x305/v2/https://flxt.tmsimg.com/assets/p163191_p_v8_al.jpg",
                "http://gonewiththetwins.com/new/wp-content/uploads/2014/01/avatar.jpg",
                "http://gonewiththetwins.com/new/wp-content/uploads/2014/01/avatar.jpg"),
            rating = "7.9"),
        Movie(id = "tt0499550",
            title = "The Wulf of wall Street",
            year = "2009",
            genre = "Action, Adventure, Fantasy",
            director = "James Cameron",
            actors = "Sam Worthington, Zoe Saldana, Sigourney Weaver, Stephen Lang ",
            plot ="",
            poster ="http://gonewiththetwins.com/new/wp-content/uploads/2014/01/avatar.jpg",
            image = listOf("https://resizing.flixster.com/5sDJkJ3tWO0tFl7mtqvfWGXzgtE=/206x305/v2/https://flxt.tmsimg.com/assets/p9991602_p_v12_aj.jpg",
                "http://gonewiththetwins.com/new/wp-content/uploads/2014/01/avatar.jpg",
                "http://gonewiththetwins.com/new/wp-content/uploads/2014/01/avatar.jpg"),
            rating = "7.9"),
        Movie(id = "tt0499551",
            title = "Vikings",
            year = "2009",
            genre = "Action, Adventure, Fantasy",
            director = "James Cameron",
            actors = "Sam Worthington, Zoe Saldana, Sigourney Weaver, Stephen Lang ",
            plot ="",
            poster ="http://gonewiththetwins.com/new/wp-content/uploads/2014/01/avatar.jpg",
            image = listOf("https://resizing.flixster.com/GvtRsEF5VoPZlsyhmNCsS1ApQNc=/206x305/v2/https://flxt.tmsimg.com/assets/p9155926_b_v10_au.jpg",
                "http://gonewiththetwins.com/new/wp-content/uploads/2014/01/avatar.jpg",
                "http://gonewiththetwins.com/new/wp-content/uploads/2014/01/avatar.jpg"),
            rating = "7.9"),
        Movie(id = "tt0499552",
            title = "The Lion king",
            year = "2009",
            genre = "Action, Adventure, Fantasy",
            director = "James Cameron",
            actors = "Sam Worthington, Zoe Saldana, Sigourney Weaver, Stephen Lang ",
            plot ="",
            poster ="http://gonewiththetwins.com/new/wp-content/uploads/2014/01/avatar.jpg",
            image = listOf("https://resizing.flixster.com/37nvjsHybtXd0q_Ae144Eu4itMQ=/206x305/v2/https://resizing.flixster.com/tjFCnGQsGs0O1F5HPx9vaVyWzho=/ems.ZW1zLXByZC1hc3NldHMvbW92aWVzLzYyYWU2MmIwLTE3NDMtNDJlZi04MzQ1LTViNjVjMzA3YTlkMi53ZWJw",
                "http://gonewiththetwins.com/new/wp-content/uploads/2014/01/avatar.jpg",
                "http://gonewiththetwins.com/new/wp-content/uploads/2014/01/avatar.jpg"),
            rating = "7.9"),
        Movie(id = "tt0499553",
            title = "You",
            year = "2009",
            genre = "Action, Adventure, Fantasy",
            director = "James Cameron",
            actors = "Sam Worthington, Zoe Saldana, Sigourney Weaver, Stephen Lang ",
            plot ="",
            poster ="http://gonewiththetwins.com/new/wp-content/uploads/2014/01/avatar.jpg",
            image = listOf("https://resizing.flixster.com/BkJWD2a7CsEJRW0nkMOtIEdsEQA=/206x305/v2/https://flxt.tmsimg.com/assets/p14418847_b_v13_ab.jpg",
                "http://gonewiththetwins.com/new/wp-content/uploads/2014/01/avatar.jpg",
                "http://gonewiththetwins.com/new/wp-content/uploads/2014/01/avatar.jpg"),
            rating = "7.9")

    )
}
