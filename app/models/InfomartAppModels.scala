package models

import java.time.{LocalDate, LocalDateTime}

import play.api.libs.json.{Json, Reads, Writes}
import utils.JsonUtils

/**
  * Created by greboul on 2016-08-26.
  */

case class Query
(
  id: Long,
  created_at: LocalDateTime,
  created_by: Int,
  updated_at: Option[LocalDateTime],
  updated_by: Option[Int],
  deleted_at: Option[LocalDateTime],
  deleted_by: Option[Int],
  account_id: Long,
  portfolio_id: Long,
  name: String,
  description: Option[String],
  cache_count_of_news: Int,
  cache_count_of_social: Int
)

case class _available_sources
(
  id: Long,
  name: String,
  region_id: Long,
  media_id: Long,
  code: Option[String],
  created_at: Option[LocalDateTime]
)
case class _ci_sessions
(
  session_id: String,
  ip_address: String,
  user_agent: String,
  last_activity: Int,
  user_data: String
)
case class _media_types
(
  id: Long,
  name: String
)
case class account_bundles
(
  id: Long,
  account_id: Option[Int],
  bundle_id: Option[String],
  source_id: Option[String],
  source_or_bundle: String,
  plus_or_minus: String
)
case class account_default_features
(
  id: Long,
  account_type_id: Long,
  feature_id: Long,
  value: Option[Int]
)
case class account_features
(
  id: Long,
  account_id: Long,
  feature_id: Option[Int],
  value: Option[Int],
  start_date: Option[LocalDateTime],
  end_date: Option[LocalDateTime]
)
case class account_free_dbs
(
  id: Long,
  account_id: Long,
  free_db: Option[String]
)
case class account_optional_addons
(
  id: Long,
  account_type_id: Long,
  feature_id: Long,
  value: Int
)
case class account_types
(
  id: Long,
  name: String
)
case class account_user_permissions
(
  id: Long,
  name: Option[String]
)
case class account_user_twitter_historys
(
  id: Long,
  created_at: LocalDateTime,
  user_id: Long,
  portfolio_id: Long,
  screen_name: String,
  in_response_to: Option[String],
  reply_to_tweet_id: Option[String],
  status: Option[String]
)
case class account_user_twitter_oauths
(
  id: Long,
  account_id: Long,
  user_id: Long,
  access_token__screen_name: String,
  access_token__user_id: String,
  access_token__oauth_token: String,
  access_token__oauth_access_token_secret: String,
  is_default: Option[Boolean]
)
case class account_users
(
  id: Long,
  account_id: Long,
  user_id: Long,
  permission_level_id: Option[Int],
  has_kiosk: Boolean,
  allow_broadcast: Option[Boolean],
  auto_load_broadcast: Option[Boolean],
  created_at: Option[LocalDateTime],
  last_login_at: Option[LocalDateTime],
  default_account_user_twitter_oauth_id: Option[Int],
  has_intranet: Option[Boolean],
  is_topic_admin: Option[Boolean],
  allow_social_query_modify: Option[Boolean],
  allow_newsletter_plus: Boolean,
  enable_heartbeat_access: Option[Boolean],
  heartbeat_url: Option[String]
)
case class account_users_broadcast
(
  id: Long,
  account_user_id: Long,
  allow_broadcast: Boolean
)
case class accounts
(
  id: Long,
  name: Option[String],
  z_account_number: Option[String],
  account_type: Option[Int],
  parent_account_id: Option[Int],
  newsletter_plus_migrated_at: Option[LocalDateTime]
)
case class admin_permission_levels
(
  id: Long,
  name: Option[String],
  permission_id: Option[Int]
)
case class alert_media_types
(
  id: Long,
  name: String,
  news: Boolean,
  social: Boolean,
  media_type: String,
  string: String,
  sort_order: Option[Int]
)
case class alerts_activity
(
  id: Long,
  alert_id: Option[Int],
  activity_type: Int,
  activity_time: LocalDateTime,
  hit_count: Int,
  last_hit_time: Option[LocalDateTime],
  articles_sent: Option[Int],
  summary_sent: Option[Int],
  unique_keys: Option[String],
  similar_hashes: Option[String]
)
case class auth_patterns
(
  id: Long,
  account_id: Long,
  pattern: Option[String],
  comment: Option[String],
  created_at: LocalDateTime,
  created_by: Int,
  updated_at: Option[LocalDateTime],
  updated_by: Option[Int]
)
case class authority
(
  title_id: String,
  decile: Option[Int]
)
case class available_sources
(
  id: Long,
  account_id: Option[Int],
  sources: Option[String],
  created_at: Option[LocalDateTime]
)
case class bundles
(
  id: Long,
  bundle_id: String,
  description: Option[String],
  bundle_order: Option[Int]
)
case class cats
(
  id: Long,
  CatID: String,
  CatName: Option[String],
  CatOrder: Int,
  CatParents: Option[String],
  individual: Option[Boolean],
  deleted: Option[Boolean],
  form: Option[String],
  mix: Option[String],
  ucon: Option[Boolean],
  nav: Option[Int]
)
case class ci_sessions
(
  session_id: String,
  ip_address: String,
  user_agent: String,
  last_activity: Int,
  user_data: String
)
case class client_admin_accounts
(
  id: Long,
  user_id: Long,
  account_id: Long,
  created_at: LocalDateTime,
  deleted_at: Option[LocalDateTime],
  deleted_by: Option[Int]
)
case class clipboard_result_notes
(
  id: Long,
  created_at: LocalDateTime,
  created_by: Option[Int],
  updated_at: Option[LocalDateTime],
  updated_by: Option[Int],
  clipboard_result_id: Long,
  body: Option[String],
  user_id: Long
)
case class clipboard_results
(
  id: Long,
  session_id: Option[String],
  created_at: LocalDateTime,
  created_by: Int,
  updated_at: Option[LocalDateTime],
  updated_by: Option[Int],
  account_user_id: Long,
  topic_query_source_id: Option[Int],
  media_major: Option[String],
  media_minor: Option[String],
  publication: Option[String],
  title: Option[String],
  text: Option[String],
  author__avatar: Option[String],
  author__followers_count: Option[Int],
  author__name: Option[String],
  author__url: Option[String],
  author__username: Option[String],
  author__location__country_code: Option[String],
  page: Option[String],
  edition: Option[String],
  length: Option[String],
  published_at: Option[LocalDateTime],
  arrived_at: Option[LocalDateTime],
  gender: Option[String],
  language: Option[String],
  tone: Option[String],
  url: Option[String],
  authority: Option[Int],
  reach: Option[Int],
  unique_key: Option[String],
  peek_object: Option[String],
  clip_start: Option[String],
  clip_length: Option[Int],
  country: Option[String],
  region: Option[String],
  ad_value: Option[Int],
  doc_id: Option[String]
)
case class cm_downloads
(
  id: Long,
  user_id: Long,
  account_id: Long,
  unique_key: String,
  db_code: String,
  pub_id: Long,
  published_at: Option[LocalDateTime],
  cm_channel_id: Long,
  cm_text_id: String,
  cm_start: Option[String],
  cm_length: Int,
  format: String,
  title: Option[String],
  publication: Option[String],
  email: Option[String],
  created_at: LocalDateTime,
  cm_download_id: Option[Int],
  cm_created_at: Option[String],
  cm_failed: Option[Boolean],
  callback_at: Option[LocalDateTime],
  cm_url: Option[String],
  downloaded_at: Option[LocalDateTime]
)
case class current_events
(
  id: Long,
  app: String,
  name: Option[String],
  description: Option[String],
  sunset_datetime: Option[LocalDateTime],
  app_id: Long,
  group_id: Long
)
case class custom_alert_subscriptions
(
  id: Long,
  account_id: Long,
  user_id: Long,
  subscription_group_id: Long,
  portfolio_id: Option[Int],
  data_id: Long,
  title: String,
  metric: Option[String],
  of_primary: String,
  variable_primary: Option[String],
  of_secondary: String,
  variable_secondary: Option[String],
  criteria: String,
  value: Int,
  interval: String,
  media_type_news: Boolean,
  news_hits_per_day: Option[Int],
  format: Option[String],
  media_type_social: Boolean,
  social_hits_per_day: Option[Int],
  last_send_date: Option[LocalDateTime],
  last_result_date: Option[LocalDateTime],
  created_at: Option[LocalDateTime],
  updated_at: Option[LocalDateTime],
  last_docid: Option[String],
  article_emails_sent: Int,
  article_emails_date: Option[LocalDateTime],
  last_hit_time: Option[LocalDateTime],
  deleted_at: Option[LocalDateTime],
  deleted_by: Option[Int],
  last_run_time: LocalDateTime
)
case class daily_summary_subscriptions
(
  id: Long,
  user_id: Option[Int],
  subscription_type_id: Option[Int],
  data_id: Option[Int],
  send_summary_at: Option[String],
  updated_at: Option[LocalDateTime]
)
case class email_activity
(
  id: Long,
  to_address: String,
  from_address: Option[String],
  bounce_address: Option[String],
  subject: Option[String],
  message_id: Option[String],
  error_code: Int,
  error_message: Option[String],
  sent_at: LocalDateTime
)
case class email_bounces
(
  id: Long,
  email_address: String,
  _type: Option[String],  // needs mapping, named "type" in the db
  sub_type: Option[String],
  mta: Option[String],
  status: Option[String],
  action: Option[String],
  diagnostic: Option[String],
  feedback_id: Option[String],
  bounced_at: Option[LocalDateTime],
  source: Option[String],
  destination: Option[String],
  message_id: Option[String],
  sent_at: Option[LocalDateTime],
  created_at: LocalDateTime
)
case class es_query_log
(
  id: Long,
  value: Option[String],
  timestamp: Option[LocalDateTime],
  length: Option[Int]
)
case class fast_servers
(
  id: String,
  primary: String,
  secondary: String
)
case class features
(
  id: Long,
  name: Option[String],
  code: Option[String],
  value_related: Option[Boolean],
  updateable_value: Boolean,
  human_name: Option[String],
  human_no_value: Option[String]
)
case class folder_result_notes
(
  id: Long,
  created_at: LocalDateTime,
  created_by: Option[Int],
  updated_at: Option[LocalDateTime],
  updated_by: Option[Int],
  folder_result_id: Long,
  body: Option[String],
  user_id: Long
)
case class folder_result_tags
(
  id: Long,
  folder_result_id: Long,
  tag_id: Option[Int]
)
case class folder_results
(
  id: Long,
  created_at: LocalDateTime,
  created_by: Int,
  updated_at: Option[LocalDateTime],
  updated_by: Option[Int],
  folder_id: Long,
  topic_query_source_id: Option[Int],
  media_major: Option[String],
  media_minor: Option[String],
  publication: Option[String],
  title: Option[String],
  text: Option[String],
  author__avatar: Option[String],
  author__followers_count: Option[Int],
  author__name: Option[String],
  author__url: Option[String],
  author__username: Option[String],
  author__location__country_code: Option[String],
  page: Option[String],
  edition: Option[String],
  length: Option[String],
  published_at: Option[LocalDateTime],
  arrived_at: Option[LocalDateTime],
  gender: Option[String],
  language: Option[String],
  tone: Option[String],
  url: Option[String],
  authority: Option[Int],
  reach: Option[Int],
  unique_key: Option[String],
  peek_object: Option[String],
  clip_start: Option[String],
  clip_length: Option[Int],
  country: Option[String],
  region: Option[String],
  ad_value: Option[Int],
  doc_id: Option[String]
)
case class folder_user_settings
(
  folder_id: Long,
  user_id: Long,
  sequence: Int
)
case class folders
(
  id: Long,
  created_at: LocalDateTime,
  created_by: Int,
  updated_at: Option[LocalDateTime],
  updated_by: Option[Int],
  deleted_at: Option[LocalDateTime],
  deleted_by: Option[Int],
  account_id: Long,
  portfolio_id: Long,
  name: String,
  description: Option[String],
  cache_count_of_news: Int,
  cache_count_of_social: Int,
  ayce: Boolean,
  ayce_query: Option[String],
  ayce_last_run: Option[LocalDateTime]
)
case class ingress
(
  ingress_id: Long,
  page_name: Option[String],
  required: Option[Boolean],
  priority: Option[Int],
  eligibility: Option[String],
  ineligbility: Option[String]
)
case class ingress_access
(
  access_id: Long,
  _ingress_id: Option[Int],
  user_id: Option[Int],
  skip_count: Option[Int],
  consent: Option[Boolean],
  ineligible: Option[Boolean]
)
case class ip_industries
(
  id: Long,
  app: String,
  app_id: Option[Int],
  name: String,
  description: Option[String],
  gics1: Option[String],
  gics2: Option[String],
  short_name: Option[String]
)
case class litmus_campaigns
(
  id: Long,
  newsletter_issue_id: Long,
  litmus_id: Long,
  litmus_bughtml: Option[String],
  litmus_guid: String,
  litmus_reportguid: Option[String],
  litmus_userguid: Option[String],
  litmus_createdat: Option[LocalDateTime],
  litmus_sentat: Option[LocalDateTime],
  litmus_expiresat: Option[LocalDateTime],
  litmus_neverexpires : Boolean
)
case class mc_beats
(
  category_id: Long,
  categoryname: String
)
case class mc_contact_outlets
(
  contact_id: Long,
  outlet_id: Long
)
case class mc_contacts
(
  contact_id: Long,
  firstname: Option[String],
  fullname: Option[String],
  lastname: Option[String],
  outlets: Option[String],
  workphone: Option[String],
  worktitle: Option[String],
  email: Option[String],
  street1: Option[String],
  street2: Option[String],
  city: Option[String],
  state: Option[String],
  country: Option[String],
  zip: Option[String],
  mediatypes: Option[String],
  topicscovered: Option[String],
  profile: Option[String]
)
case class mc_customs
(
  contact_id: Long,
  firstname: Option[String],
  lastname: Option[String],
  company: Option[String],
  workphone: Option[String],
  mobile: Option[String],
  worktitle: Option[String],
  email: Option[String],
  street1: Option[String],
  street2: Option[String],
  city: Option[String],
  state: Option[String],
  country: Option[String],
  zip: Option[String],
  beats: Option[String],
  outlets: Option[String],
  profile: Option[String]
)
case class mc_list_items
(
  id: Long,
  list_id: Long,
  contact_id: Long,
  save_user_id: Option[String],
  save_date: LocalDateTime,
  custom: Option[Boolean],
  firstname: Option[String],
  lastname: Option[String]
)
case class mc_lists
(
  id: Long,
  portfolio_id: Long,
  name: String,
  description: String,
  create_date: LocalDateTime,
  mod_date: LocalDateTime,
  num_items: Int
)
case class mc_notes
(
  id: Long,
  contact_id: Long,
  portfolio_id: Long,
  note: Option[String],
  note_created: Option[LocalDateTime],
  note_userid: Long,
  note_username: Option[String],
  twitter: Option[String],
  linkedin: Option[String],
  facebook: Option[String],
  links: Option[String]
)
case class mc_outlets
(
  outlet_id: Long,
  outletname: Option[String],
  outleturl: Option[String],
  street1: Option[String],
  street2: Option[String],
  city: Option[String],
  state: Option[String],
  zip: Option[String],
  country: Option[String],
  frequency: Option[String],
  publicationfocus: Option[String],
  mediatype: Option[String],
  mediaprofile: Option[String]
)
case class media_types
(
  id: Long,
  name: String
)
case class medias
(
  id: Long,
  name: String,
  media_type_id: Long,
  order_by: Option[Int],
  code: Option[String]
)
case class news_publications
(
  id: Long,
  title_id: Long,
  db_code: String,
  active: Boolean,
  name: Option[String],
  ex_publication: Option[String],
  pub_cat: Option[String],
  region: Option[String],
  long_descrip: Option[String],
  update_freq: Option[String],
  coverage_start: Option[LocalDateTime],
  coverage_end: Option[LocalDateTime],
  launch_date: Option[LocalDateTime],
  geo_location: Option[String],
  recent_content: Option[Boolean],
  fast_count: Option[Int]
)
case class news_sources
(
  id: Long,
  db_code: String,
  active: Boolean,
  name: Option[String],
  has_pubs: Option[Boolean],
  cat: Option[String],
  base: Option[String],
  region: Option[String],
  publisher: Option[String],
  copyright: Option[String],
  long_descrip: Option[String],
  update_freq: Option[String],
  coverage_start: Option[LocalDateTime],
  coverage_end: Option[LocalDateTime],
  launch_date: Option[LocalDateTime],
  geo_location: Option[String],
  recent_content: Option[Boolean],
  fast_count: Option[Int],
  media_type: Option[String]
)
case class newsletter_builder_design
(
  id: Long,
  newsletter_id: Option[Int],
  newsletter_manifest: Option[String]
)
case class newsletter_builder_image_list
(
  id: Long,
  account_id: Long,
  image_name: Option[String],
  image_url: Option[String],
  uploaded_by: Option[Int],
  deleted_by: Option[Int]
)
case class newsletter_builder_issue
(
  id: Long,
  newsletter_id: Option[Int],
  sent_at: Option[LocalDateTime],
  sent_by: Option[Int],
  portfolio_id: Option[Int],
  deleted_at: Option[LocalDateTime],
  deleted_by: Option[Int],
  newsletter_type: Option[String],
  sent_newsletter: Option[String],
  file_name: Option[String],
  newsletter_url: Option[String]
)
case class newsletter_builder_schedule
(
  id: Long,
  newsletter_id: Long,
  created_at: LocalDateTime,
  created_by: Int,
  updated_at: Option[LocalDateTime],
  updated_by: Option[Int],
  editor_id: Option[Int],
  wd_mon: Option[Boolean],
  wd_tue: Option[Boolean],
  wd_wed: Option[Boolean],
  wd_thu: Option[Boolean],
  wd_fri: Option[Boolean],
  wd_sat: Option[Boolean],
  wd_sun: Option[Boolean],
  time: Option[String]
)
case class newsletter_builder_template
(
  id: Long,
  created_at: LocalDateTime,
  created_by: Int,
  updated_at: Option[LocalDateTime],
  updated_by: Option[Int],
  deleted_at: Option[LocalDateTime],
  deleted_by: Option[Int],
  portfolio_id: Long,
  account_id: Long,
  name: String,
  description: Option[String],
  recipients: Option[String],
  editor_id: Option[Int],
  last_sent_at: Option[LocalDateTime],
  secure_network_link: Option[Boolean],
  schedule_type: Option[String]
)
case class newsletter_issue
(
  id: Long,
  newsletter_id: Option[Int],
  send_date: Option[LocalDateTime],
  send_by: Option[Int],
  portfolio_id: Option[Int],
  date_from: Option[LocalDate],
  date_to: Option[LocalDate],
  deleted_at: Option[LocalDateTime],
  created_at: Option[LocalDateTime],
  deleted_by: Option[Int],
  newsletter_uri: Option[String]
)
case class newsletter_issue_secure_link
(
  id: Long,
  issue_id: Long,
  file_name: Option[String],
  newsletter_url: String
)
case class newsletter_plus_reader
(
  reader_guid: String,
  created_at: Option[LocalDateTime],
  last_time_accessed: Option[LocalDateTime],
  last_ip_used: Option[String],
  access_count: Option[Int]
)
case class newsletter_plus_token
(
  guid: String,
  newsletter_id: Long,
  account_id: Long,
  editor_id: Long,
  portfolio_id: Long,
  newsletter_issue_id: Option[Int],
  created_at: Option[LocalDateTime]
)
case class newsletter_plus_token_peeks
(
  token_guid: String,
  peek_id: Long,
  peek_key: String
)
case class newsletter_plus_token_recipients
(
  id: String,
  email_address: String,
  last_used: Option[LocalDateTime]
)
case class newsletter_plus_tracker_data
(
  id: Long,
  newsletter_guid: Option[String],
  recipient_guid: Option[String],
  peek_id: Option[Int],
  reader_guid: Option[String],
  reader_ip_address: Option[String],
  hostname: Option[String],
  organization: Option[String],
  city: Option[String],
  region: Option[String],
  region_iso_code: Option[String],
  postal_code: Option[String],
  country: Option[String],
  country_iso_code: Option[String],
  continent: Option[String],
  map_location: Option[String],
  metro_code: Option[Int],
  time_zone: Option[String],
  is_mobile: Option[Boolean],
  is_tablet: Option[Boolean],
  device: Option[String],
  browser_working: Option[String],
  browser_name: Option[String],
  browser_version: Option[String],
  os: Option[String],
  os_version: Option[String],
  user_agent: Option[String],
  created_at: Option[LocalDateTime]
)
case class newsletter_plus_tracker_email_forwards
(
  id: Long,
  newsletter_guid: String,
  created_at: Option[LocalDateTime]
)
case class newsletter_plus_tracker_email_opens
(
  id: Long,
  newsletter_guid: String,
  created_at: Option[LocalDateTime]
)
case class newsletter_plus_tracker_time_open
(
  id: Long,
  newsletter_guid: String,
  recipient_guid: Option[String],
  reader_guid: Option[String],
  time_open: Option[Int]
)
case class newsletter_schedule
(
  id: Long,
  newsletter_id: Option[Int],
  weekday: Option[String],
  time: Option[String],
  created_at: Option[LocalDateTime],
  updated_at: Option[LocalDateTime],
  _type: Option[String]  // needs mapping, named "type" in the db
)
case class newsletter_sources
(
  id: Long,
  data_source_id: Option[Int],
  newsletter_id: Option[Int],
  created_at: Option[LocalDateTime],
  updated_at: Option[LocalDateTime],
  _type: Option[String],
  source_order: Option[Int],
  show_news: Option[Boolean],
  show_social: Option[Boolean]
)
case class newsletter_templates
(
  id: Long,
  created_at: LocalDateTime,
  created_by: Int,
  updated_at: Option[LocalDateTime],
  updated_by: Option[Int],
  deleted_at: Option[LocalDateTime],
  deleted_by: Option[Int],
  portfolio_id: Long,
  name: String,
  description: Option[String],
  recipients: Option[String],
  show_duplicates: Option[Boolean],
  show_media_analysis: Option[Boolean],
  show_highlighting: Option[Boolean],
  show_empty_folders: Option[Boolean],
  show_page_number: Option[Boolean],
  show_logo: Option[String],
  show_broadcast_links: Option[Boolean],
  show_content: Option[Boolean],
  show_lead: Option[Int],
  avatar: Option[String],
  primary_schedule: Option[String],
  secondary_schedule: Option[String],
  last_sent_at: Option[LocalDateTime],
  secure_network_link: Option[Boolean]
)
case class parent_account
(
  id: Long,
  name: Option[String]
)
case class permission_levels
(
  id: Long,
  name: Option[String]
)
case class portfolio_users
(
  id: Long,
  portfolio_id: Long,
  user_id: Long,
  permission_level_id: Long,
  news_read_at: Option[LocalDateTime],
  social_read_at: Option[LocalDateTime],
  portfolio_order: Option[Int],
  is_default: Option[Boolean]
)
case class portfolios
(
  id: Long,
  created_at: Option[LocalDateTime],
  created_by: Option[Int],
  updated_at: Option[LocalDateTime],
  updated_by: Option[Int],
  deleted_at: Option[LocalDateTime],
  deleted_by: Option[Int],
  confirmation_word: Option[String],
  name: String,
  description: Option[String],
  twitter_handle: Option[String],
  account_id: Option[Int],
  order_by: Option[Int],
  social_quota_id: Long,
  social_enabled: Option[Boolean]
)
case class regions_new
(
  id: Long,
  region_id: String,
  name: String,
  parents: Option[String],
  individual: Boolean,
  deleted: Boolean,
  sort: Int,
  canada: Option[Boolean],
  ma: Option[String],
  nav: Option[Int]
)
case class report_issue
(
  id: Long,
  report_id: Long,
  name: String,
  report_type_id: Long,
  created_at: LocalDateTime,
  created_by: Int,
  report_email: Option[String],
  report_print: Option[String],
  portfolio_id: Long,
  report_json_object: Option[String]
)
case class report_sources
(
  id: Long,
  data_source_id: Option[Int],
  report_id: Option[Int],
  created_at: Option[LocalDateTime],
  updated_at: Option[LocalDateTime],
  _type: Option[String], // needs mapping, named "type" in the db
  show_news: Option[Boolean],
  show_social: Option[Boolean]
)
case class report_specifications
(
  id: Long,
  name: Option[String],
  report_type_id: Long,
  deleted_at: Option[LocalDateTime],
  dataset_key: Option[String],
  is_active: Option[Boolean],
  is_tag_related: Option[Boolean],
  tag_set_type_data: Option[String],
  show_news: Option[Boolean],
  show_social: Option[Boolean],
  custom_id: Option[Int],
  sort: Option[Int]
)
case class report_specifications_custom
(
  id: Long,
  metric_type: Option[String],
  metric: Option[String],
  deleted_at: Option[LocalDateTime],
  dataset_key: Option[String],
  is_active: Option[Boolean],
  is_tag_related: Option[Boolean],
  tag_set_type_data: Option[String],
  show_news: Option[Boolean],
  show_social: Option[Boolean],
  chart_type: Option[String]
)
case class report_tag_sets
(
  id: Long,
  report_id: Long,
  tag_set_id: Long
)
case class report_template_elements
(
  id: Long,
  report_id: Long,
  template_id: Long,
  tag_set_id: Long,
  name: String,
  description: Option[String],
  created_at: LocalDateTime,
  deleted_at: Option[LocalDateTime]
)
case class report_templates
(
  id: Long,
  created_at: LocalDateTime,
  created_by: Int,
  updated_at: Option[LocalDateTime],
  updated_by: Option[Int],
  deleted_at: Option[LocalDateTime],
  portfolio_id: Long,
  name: String,
  description: Option[String],
  report_type_id: Long,
  avatar: Option[String]
)
case class report_types
(
  id: Long,
  name: String,
  _type: Option[String] // needs to be mapped, it's "type" in the DB
)
case class search_news_queries
(
  id: Long,
  created_at: LocalDateTime,
  created_by: Int,
  date: Option[String],
  phrases: Option[String],
  operators: Option[String],
  query: Option[String],
  news_source_library_id: Option[Int],
  news_sources: Option[String],
  news_filters: Option[String],
  last_hit_count: Option[Int],
  last_hit_count_updated_at: Option[LocalDateTime]
)
case class session_ids
(
  id: Long,
  session_id: String,
  account_id: Long,
  user_id: Long,
  set_at: LocalDateTime
)
case class settings
(
  id: Long,
  key_name: Option[String],
  data: Option[String]
)
case class site_message
(
  id: Long,
  text: Option[String],
  start_date: LocalDate,
  end_date: LocalDate,
  account_id: Long,
  created_by: Int
)
case class social_quotas
(
  id: Long,
  name: String,
  social_max: Option[Int]
)
case class source_libraries
(
  id: Long,
  name: String,
  description: Option[String],
  portfolio_id: Long,
  created_at: Option[LocalDateTime],
  updated_at: Option[LocalDateTime],
  data: Option[String]
)
case class subscription_type
(
  id: Long,
  name: Option[String],
  key_name: Option[String]
)
case class tag_set_types
(
  id: Long,
  name: Option[String]
)
case class tag_sets
(
  id: Long,
  name: String,
  description: Option[String],
  tag_set_type_id: Long,
  portfolio_id: Long,
  deleted_at: Option[LocalDateTime],
  created_at: Option[LocalDateTime],
  updated_at: Option[LocalDateTime]
)
case class tag_types
(
  id: Long,
  name: String,
  is_smart: Int
)
case class tags
(
  id: Long,
  name: Option[String],
  tag_type_id: Long,
  search_rule: Option[String],
  tag_set_id: Long,
  description: Option[String],
  phrases: Option[String],
  operators: Option[String],
  expert_tag: Option[String],
  deleted_at: Option[LocalDateTime],
  updated_at: Option[LocalDateTime],
  created_at: Option[LocalDateTime]
)
case class task_history
(
  id: Long,
  task_id: Long,
  comments: Option[String],
  task_type_id: Option[Int],
  assigned_to: Option[Int],
  due_date: Option[LocalDate],
  task_status_id: Option[Int],
  created_at: Option[LocalDateTime],
  updated_at: Option[LocalDateTime]
)
case class task_status
(
  id: Long,
  name: String
)
case class task_types
(
  id: Long,
  name: String
)
case class tasks
(
  id: Long,
  portfolio_id: Long,
  task_type_id: Long,
  task_status_id: Long,
  created_by: Int,
  assigned_to: Option[Int],
  item_title: Option[String],
  item_key: Option[String],
  name: String,
  due_date: Option[LocalDate],
  created_at: LocalDateTime,
  updated_at: LocalDateTime,
  priority_level: Option[Int]
)
case class topic_queries
(
  id: Long,
  topic_id: Long,
  topic_query_source_id: Long,
  created_at: LocalDateTime,
  created_by: Int,
  updated_at: Option[LocalDateTime],
  updated_by: Option[Int],
  deleted_at: Option[LocalDateTime],
  deleted_by: Option[Int],
  phrases: Option[String],
  operators: Option[String],
  query: Option[String],
  news_source_library_id: Option[Int],
  news_sources: Option[String],
  news_filters: Option[String],
  registered_at: Option[LocalDateTime],
  throttled_at: Option[LocalDateTime],
  country: Option[String],
  language: Option[String],
  locations: Option[String],
  modify_query: Option[String]
)
case class topic_query_sources
(
  id: Long,
  name: String
)
case class topic_user_settings
(
  topic_id: Long,
  user_id: Long,
  sequence: Int
)
case class topics
(
  id: Long,
  created_at: Option[LocalDateTime],
  created_by: Int,
  updated_at: Option[LocalDateTime],
  updated_by: Option[Int],
  deleted_at: Option[LocalDateTime],
  deleted_by: Option[Int],
  name: Option[String],
  description: Option[String],
  portfolio_id: Long,
  last_read_at: Option[LocalDateTime]
)
case class twitter_scheduled_tweets
(
  id: Long,
  created_at: LocalDateTime,
  schedule_for: LocalDateTime,
  account_user_twitter_oauth_id: Long,
  tweet: String
)
case class uom_types
(
  id: Long,
  code: String,
  description: String,
  grouping: String
)
case class usage
(
  id: Long,
  account_id: Long,
  zuora_id: Option[String],
  user_id: Long,
  session_id: String,
  created_at: LocalDateTime,
  key: String,
  quantity: Int,
  uom: String,
  title: String,
  db_code: String,
  pub_id: Option[Int],
  doc_id: Long,
  free: Option[Boolean],
  session_type: Option[String],
  browser_session_id: Option[String],
  ayce: Boolean
)
case class usage_for_billing
(
  id: Long,
  account_id: Long,
  zuora_id: Option[String],
  user_id: Long,
  session_id: String,
  created_at: LocalDateTime,
  key: String,
  quantity: Int,
  uom: String,
  title: String,
  db_code: String,
  pub_id: Option[Int],
  doc_id: Long,
  free: Option[Boolean],
  session_type: Option[String],
  browser_session_id: Option[String],
  ayce: Boolean
)
case class user_settings
(
  id: Long,
  user_id: Long,
  setting_id: Option[Int],
  value: Option[String],
  updated_at: Option[LocalDateTime]
)

case class User
(
  id: Long,
  created_at: LocalDateTime,
  updated_at: Option[LocalDateTime],
  updated_by: Option[Int],
  deleted_at: Option[LocalDateTime],
  deleted_by: Option[Int],
  username: String,
  password: String,
  first_name: Option[String],
  last_name: Option[String],
  email_address: Option[String],
  state_id: Option[String],
  country_id: Option[String],
  default_account_id: Long,
  phone: Option[String],
  department: Option[String],
  avatar: Option[String],
  title: Option[String],
  display_name: Option[String],
  admin_level: Option[Int],
  has_broadcast: Option[Boolean],
  is_parent_admin: Boolean,
  parent_account_id: Long,
  is_active: Boolean
)

case class v_usage_to_usage_infomart
(
  id: Long,
  account_id: Long,
  zuora_id: Option[String],
  user_id: Long,
  session_id: String,
  created_at: LocalDateTime,
  key: String,
  quantity: Int,
  uom: String,
  title: String,
  db_code: String,
  pub_id: Option[Int],
  doc_id: Long,
  free: Option[Boolean],
  session_type: Option[String],
  browser_session_id: Option[String]
)
