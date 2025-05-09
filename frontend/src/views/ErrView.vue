<template>
  <h2 id="title">Error!</h2>
  <hr />
  {{ err }}
</template>

<script setup lang="ts">
import { useRoute } from 'vue-router'

const route = useRoute()
const err = route.query.errType
</script>

<style lang="css" scoped>
#title {
  text-align: center;
}
</style>
