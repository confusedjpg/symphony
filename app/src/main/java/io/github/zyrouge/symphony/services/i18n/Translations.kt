package io.github.zyrouge.symphony.services.i18n

sealed class Translations(
    val language: String,
    val songs: String,
    val artists: String,
    val albums: String,
    val settings: String,
    val details: String,
    val path: String,
    val filename: String,
    val size: String,
    val dateAdded: String,
    val lastModified: String,
    val length: String,
    val bitrate: String,
    val trackName: String,
    val artist: String,
    val album: String,
    val albumArtist: String,
    val composer: String,
    val nothingIsBeingPlayedRightNow: String,
    val playingXofY: (x: Int, y: Int) -> String,
    val addToQueue: String,
    val queue: String,
    val playNext: String,
    val nowPlaying: String,
    val language_: String,
    val materialYou: String,
    val system: String,
    val light: String,
    val dark: String,
    val black: String,
    val unknownArtistX: (name: String) -> String,
    val viewArtist: String,
    val XSongs: (x: Int) -> String,
    val title: String,
    val duration: String,
    val year: String,
    val unknownAlbumX: (id: Long) -> String,
    val viewAlbum: String,
    val searchYourMusic: String,
    val noResultsFound: String,
    val albumCount: String,
    val trackCount: String,
    val XArtists: (x: Int) -> String,
    val XAlbums: (x: Int) -> String,
    val filteringResults: String,
    val appearance: String,
    val about: String,
    val madeByX: (x: String) -> String,
    val github: String,
    val play: String,
    val previous: String,
    val next: String,
    val pause: String,
    val done: String,
    val groove: String,
    val songsFilterPattern: String,
    val reset: String,
    val theme: String,
    val newVersionAvailableX: (String) -> String,
    val checkForUpdates: String,
    val version: String,
    val shufflePlay: String,
    val viewAlbumArtist: String,
    val stop: String,
    val all: String,
    val miniPlayerExtendedControls: String,
    val fadePlaybackInOut: String,
    val requireAudioFocus: String,
    val ignoreAudioFocusLoss: String,
    val player: String,
    val playOnHeadphonesConnect: String,
    val pauseOnHeadphonesDisconnect: String,
    val genre: String,
    val XKbps: (String) -> String,
    val damnThisIsSoEmpty: String,
    val primaryColor: String,
    val unk: String = "?"
) {
    object English : Translations(
        language = "English",
        songs = "Songs",
        artists = "Artists",
        albums = "Albums",
        settings = "Settings",
        details = "Details",
        path = "Path",
        filename = "Filename",
        size = "Size",
        dateAdded = "Date Added",
        lastModified = "Last Modified",
        length = "Length",
        bitrate = "Bitrate",
        trackName = "Track Name",
        artist = "Artist",
        album = "Album",
        albumArtist = "Album Artist",
        composer = "Composer",
        nothingIsBeingPlayedRightNow = "Nothing is being played right now",
        playingXofY = { x, y -> "Playing $x of $y" },
        addToQueue = "Add to queue",
        queue = "Queue",
        playNext = "Play next",
        nowPlaying = "Now Playing",
        language_ = "Language",
        materialYou = "Material You",
        system = "System",
        light = "Light",
        dark = "Dark",
        black = "Black",
        unknownArtistX = { name -> "Unknown artist ($name)" },
        viewArtist = "View artist",
        XSongs = { x -> "$x songs" },
        title = "Title",
        duration = "Duration",
        year = "Year",
        unknownAlbumX = { id -> "Unknown album (ID: ${id})" },
        viewAlbum = "View album",
        searchYourMusic = "Search your music",
        noResultsFound = "No results found",
        albumCount = "Album count",
        trackCount = "Track count",
        XArtists = { x -> "$x artists" },
        XAlbums = { x -> "$x albums" },
        filteringResults = "Filtering results...",
        appearance = "Appearance",
        about = "About",
        madeByX = { x -> "Made by $x" },
        github = "Github",
        play = "Play",
        previous = "Previous",
        next = "Next",
        pause = "Pause",
        done = "Done",
        groove = "Groove",
        songsFilterPattern = "Songs filter pattern",
        reset = "Reset",
        theme = "Theme",
        newVersionAvailableX = { x -> "New version available! ($x)" },
        checkForUpdates = "Check for updates",
        version = "Version",
        shufflePlay = "Shuffle play",
        viewAlbumArtist = "View album artist",
        stop = "Stop",
        all = "All",
        miniPlayerExtendedControls = "Mini-player extended controls",
        fadePlaybackInOut = "Fade playback in-out",
        requireAudioFocus = "Require audio focus",
        ignoreAudioFocusLoss = "Ignore audio focus loss",
        player = "Player",
        playOnHeadphonesConnect = "Play on headphones connect",
        pauseOnHeadphonesDisconnect = "Pause on headphones disconnect",
        genre = "Genre",
        XKbps = { x -> "${x}kbps" },
        damnThisIsSoEmpty = "Damn, this is so empty!",
        primaryColor = "Primary Color",
    )

    companion object {
        val all = arrayOf<Translations>(English)
        val default = English

        fun of(language: String) = all.find {
            it.language == language
        }
    }
}