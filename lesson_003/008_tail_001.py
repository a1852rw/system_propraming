#!/usr/bin/env python3
# -*- coding; utf-8 -*-

f = open('small.txt','rU')

f1 = list(f)
# fをリスト型の変数「f1」に変更する

for line in reversed(f1):
# 関数「reverse」を使いリスト内の要素を逆方向から読み込む
	print(line, end='')
# 半角スペースごとに区切って(別の要素と認識されるようにして)出力する
f.close()

# 要件1：ファイル「small.txt」を読み込む
# 要件2：読み込んだファイルを後ろの⾏から表⽰する
# 注：ファイル「small.txt」は同じディレクトリに保存してある

'''
出力する文字列
-- Football Coach	
But at least we	are not	what we	used to be
We are not what	we need	to be
We are not what	we should be
'''
