<template>
  <div class="hello">
    <h1>{{ msg }}</h1>
    <h2>Audio and Music Deep Learning</h2>
    <ul>
      <li>
        <a
          href="#/audio_classifier"
          target="_blank"
        >
          Music Genre Predictor
        </a>
      </li>
      <li>
        <a
          href="#/music_recommender"
          target="_blank"
        >
          Music Recommend-er
        </a>
      </li>
      <br>
      <li>
        <a
          href="#/audio_search"
          target="_blank"
        >
          Music Search
        </a>
      </li>
    </ul>
    <h2>Image Deep Learning</h2>
    <ul>
      <li>
        <a
          href="#/image_classifier"
          target="_blank"
        >
          Image Classifier
        </a>
      </li>
      <li>
        <a
          href="#/image_recommender"
          target="_blank"
        >
          Product Recommend-er
        </a>
      </li>
      <li>
        <a
          href="#/image_search"
          target="_blank"
        >
          Image Search
        </a>
      </li>
      <li>
        <a
          href="#/object_detection"
          target="_blank"
        >
          Object Detection
        </a>
      </li>
    </ul>
    <h2>Text Deep Learning</h2>
    <ul>
      <li>
        <a
          href="#/sentiment"
          target="_blank"
        >
          Sentiment Analysis
        </a>
      </li>
    </ul>
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  data () {
    return {
      msg: 'Welcome to Deep Learning Java'
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h1, h2 {
  font-weight: normal;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
