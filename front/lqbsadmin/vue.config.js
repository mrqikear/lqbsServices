module.exports = {
  devServer: {
    overlay: {
      warnings: true,
      errors: true,
    },
    port: 9999,
    // proxy: {
    //     '/club': {
    //         target: 'https://prod.xiaomodo.com/',
    //         changeOrigin: true, // 是否跨域
    //         pathRewrite: {
    //             '^/club': '/club'
    //         }
    //     },
    //     '/account': {
    //         target: 'https://prod.xiaomodo.com/',
    //         changeOrigin: true, // 是否跨域
    //         pathRewrite: {
    //             '^/account': '/account'
    //         }
    //     },
    //     '/order': {
    //         target: 'https://prod.xiaomodo.com/',
    //         changeOrigin: true, // 是否跨域
    //         pathRewrite: {
    //             '^/order': '/order'
    //         }
    //     },
    // }
  },

  publicPath: process.env.NODE_ENV === 'production' ? './' : '/',
  productionSourceMap: false,
  lintOnSave: 'error',
  pages: {
    index: {
      entry: './src/main.js',
      template: 'public/index.html',
      filename: 'index.html',
      chunks: ['chunk-vendors', 'chunk-common', 'index']
    },
    // AccreditSuccess: {
    //   entry: 'src/success/main.js',
    //   template: 'public/AccreditSuccess.html',
    //   filename: 'AccreditSuccess.html',
    //   chunks: ['chunk-vendors', 'chunk-common', 'AccreditSuccess']
    // }
  }
}
