#!/bin/bash
#wc -l /Users/didi/Downloads/kddcup.data
#wc -l /Users/didi/Downloads/kddcup.data_10_percent
#awk -F '\n' '$3>100 {print $1,$NF }' /Users/didi/Downloads/kddcup.data_10_percent
#sed -n '300000,300099p' /Users/didi/Downloads/kddcup.data_10_percent
sed -n "$1,$2p" $3
