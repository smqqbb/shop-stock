#!/bin/bash

echo "Getting started"

# Bundle docs into zero-dependency HTML file
npx redoc-cli bundle openapi/openapi.yaml && \
mv redoc-static.html index.html && \
echo "Changed name from redoc-static.html to index.html"