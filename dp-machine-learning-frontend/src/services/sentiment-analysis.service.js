import * as axios from 'axios'

function predictSentiment (sentence) {
  const url = `./api/classifiers/sentiment`
  return axios.post(url, {
    sentence: sentence
  })
  // get data
    .then(x => x.data)
}

export { predictSentiment }
