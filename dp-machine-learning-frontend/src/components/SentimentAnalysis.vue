<template>
  <div id="SentimentAnalysis">
    <div class="container">
      <table style="width:100%">
        <tr>
          <td>Sentence</td>
          <td><input type="text" v-model="sentence" /></td>
        </tr>
        <tr v-if="prediction != null">
          <td>Sentiment</td>
          <td>{{prediction}}</td>
        </tr>
        <tr>
          <td>&nbsp;</td>
          <td>
            <button @click="predict()">Predict Sentiment</button>
          </td>
        </tr>
      </table>
    </div>
  </div>
</template>

<script>
import { predictSentiment } from '../services/sentiment-analysis.service'

export default {
  name: 'SentimentAnalysis',
  data () {
    return {
      prediction: null,
      sentence: '',
      uploadError: null
    }
  },
  methods: {
    reset () {
      this.uploadError = null
    },
    predict () {
      predictSentiment(this.sentence)
        .then(x => {
          this.prediction = x
        })
    }
  },
  mounted () {
    this.reset()
  }
}
</script>
