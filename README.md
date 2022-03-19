# ORM wonder tales

## Development

### Update reveal.js in slides

In order to update `reveal.js` in `slides/` you can issue the following
commands:

```bash
git fetch reveal.js master
git subtree pull --prefix slides reveal.js master --squash
```
