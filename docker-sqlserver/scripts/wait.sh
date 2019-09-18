#!/usr/bin/env bash

while true; do
    count=$#
    for service in "$@"; do
        host=$(echo ${service} | awk -F: '{print $1}')
        port=$(echo ${service} | awk -F: '{print $2}')
        nc -z ${host} ${port}
        result=$?

        if [[ ${result} -eq 0 ]]; then
           echo ${service} available
           ((count-=1))
        fi
    done
    if [[ count -eq 0 ]]; then
        break
    fi
    sleep 1
done
