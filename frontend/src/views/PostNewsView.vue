<template>
  <form id="newsform">
    <label>标题</label>
    <input v-model="News?.title"/>
    <br>
    <label>内容</label>
    <textarea rows="10" v-model="News?.content"></textarea>
    <br>
    <button>发送</button>
  </form>
</template>

<script setup lang="ts">
import type { News } from '@/types';

const News = defineModel<News>()
</script>

<style lang="css" scoped>
#newsform{
  text-align: center;
}
</style>
