import React, {Fragment, useEffect, useState} from "react";
import PropTypes from "prop-types";
import Select from "react-select";
import { Listbox, Transition } from '@headlessui/react'
import { CheckIcon, ChevronUpDownIcon } from '@heroicons/react/20/solid'
import TeacherEngStat from "./TeacherEngStat";



function classNames(...classes) {
  return classes.filter(Boolean).join(' ')
}


export default function TeacherExamNumSelect({
  options,
    changeExamNumber,
}) {
  const people = [
    {
      id: 1,
      name: 'Wade Cooper',
      avatar:
        'https://images.unsplash.com/photo-1491528323818-fdd1faba62cc?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=facearea&facepad=2&w=256&h=256&q=80',
    },
    {
      id: 2,
      name: 'Arlene Mccoy',
      avatar:
        'https://images.unsplash.com/photo-1550525811-e5869dd03032?ixlib=rb-1.2.1&auto=format&fit=facearea&facepad=2&w=256&h=256&q=80',
    },
  ]
  const [selected, setSelected] = useState(people[0])


  return (
      <Listbox value={selected} onChange={setSelected}>
        {({open}) => (
            <>
              <div className="relative flex flex-col min-w-0 break-words bg-white rounded mb-6 xl:mb-0 shadow-lg">
                <div className="flex-auto p-4">
                  <div className="relative w-full pr-4 max-w-full flex-grow flex-1 text-center">

                    <div className="relative mt-2">
                      <Listbox.Button
                          className="relative w-full h-4/5 cursor-default rounded-md bg-white py-1.5 pl-3 pr-10 text-left text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 focus:outline-none focus:ring-2 focus:ring-indigo-500 sm:text-sm sm:leading-6">
                        <span className="flex items-center">
                          <span className="ml-3 block truncate font-semibold text-xl text-blueGray-700">{selected.name}</span>
                        </span>
                        <span className="pointer-events-none absolute inset-y-0 right-0 top-0 ml-3 flex-raw items-center pr-2">
                          <ChevronUpDownIcon className="h-5 w-5 text-gray-400" aria-hidden="true"/>
                        </span>
                      </Listbox.Button>
                      <Transition
                          show={open}
                          as={Fragment}
                          leave="transition ease-in duration-100"
                          leaveFrom="opacity-100"
                          leaveTo="opacity-0"
                      >
                        <Listbox.Options
                            className="absolute z-10 mt-1 max-h-56 w-full overflow-auto rounded-md bg-white py-1 text-base shadow-lg ring-1 ring-black ring-opacity-5 focus:outline-none sm:text-sm">
                          {people.map((person) => (
                              <Listbox.Option
                                  key={person.id}
                                  className={({active}) =>
                                      classNames(
                                          active ? 'bg-lightBlue-500 text-white' : 'text-gray-900',
                                          'relative cursor-default select-none py-2 pl-3 pr-9'
                                      )
                                  }
                                  value={person}
                              >
                                {({selected, active}) => (
                                    <>
                                      <div className="flex items-center">
                                        <img src={person.avatar} alt="" className="h-5 w-5 flex-shrink-0 rounded-full"/>
                                        <span
                                            className={classNames(selected ? 'font-semibold' : 'font-normal', 'ml-3 block truncate')}
                                        >
                                          {person.name}
                                        </span>
                                      </div>

                                      {selected ? (
                                          <span
                                              className={classNames(
                                                  active ? 'text-white' : 'text-indigo-600',
                                                  'absolute inset-y-0 right-0 flex items-center pr-4'
                                              )}
                                          >
                                            <CheckIcon className="h-5 w-5" aria-hidden="true"/>
                                          </span>
                                      ) : null}
                                    </>
                                )}
                              </Listbox.Option>
                          ))}
                        </Listbox.Options>
                      </Transition>
                    </div>
                  </div>
                </div>
              </div>
            </>
        )}
      </Listbox>
  );
}
