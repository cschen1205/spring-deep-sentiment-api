import Vue from 'vue'
import Router from 'vue-router'
import MachineLearningCatalogue from '@/components/MachineLearningCatalogue'
import SentimentAnalysis from '@/components/SentimentAnalysis'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'MachineLearningCatalogue',
      component: MachineLearningCatalogue
    },
    {
      path: '/sentiment',
      name: 'SentimentAnalysis',
      component: SentimentAnalysis
    }
  ]
})
